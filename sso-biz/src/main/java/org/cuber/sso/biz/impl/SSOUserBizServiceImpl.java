package org.cuber.sso.biz.impl;

import org.apache.commons.collections4.CollectionUtils;
import org.cuber.sso.biz.SSOUserBizService;
import org.cuber.sso.helper.SSOHelper;
import org.cuber.sso.service.SSOResourceService;
import org.cuber.sso.service.SSORoleService;
import org.cuber.sso.service.SSOUserGroupService;
import org.cuber.sso.service.SSOUserService;
import org.cuber.stub.sso.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@Service
public class SSOUserBizServiceImpl implements SSOUserBizService {

    @Autowired
    private SSOResourceService ssoResourceService;

    @Autowired
    private SSORoleService ssoRoleService;

    @Autowired
    private SSOUserService ssoUserService;

    @Autowired
    private SSOUserGroupService ssoUserGroupService;

    @Override
    public SSOUser loadUser(SSOUser ssoUser) {
        SSOUser result = ssoUserService.retrieveUser(ssoUser);
        if (Objects.nonNull(result)) {
            List<SSOUserGroup> ssoUserGroup = ssoUserGroupService.retrieveByUserId(result.getUserId());
            if (CollectionUtils.isNotEmpty(ssoUserGroup)) {
                ssoUser.setSsoUserGroups(new HashSet<>(ssoUserGroup));
            }
            List<SSORole> userRoles = ssoRoleService.retrieveByUserId(ssoUser.getUserId());
            HashSet<SSOMenu> allMenus = new HashSet<>();
            if (CollectionUtils.isNotEmpty(userRoles)) {
                userRoles.forEach(ssoRole -> {
                    List<SSOResource> ssoResources = ssoResourceService.retrieveByRoleId(ssoRole.getRoleId());
                    ssoRole.setResources(new HashSet<>(ssoResources));
                    ssoResources.forEach(ssoResource -> {
                        if (ssoResource instanceof SSOMenu) {
                            allMenus.add((SSOMenu) ssoResource);
                        }
                    });
                });
                ssoUser.setRoles(new HashSet<>(userRoles));
                SSOMenu menu = SSOHelper.all2One(allMenus);
                ssoUser.setSuitMenu(menu);
            }
        }
        return result;
    }
}
