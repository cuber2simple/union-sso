package org.cuber.sso.service.impl;

import org.apache.commons.collections4.CollectionUtils;
import org.cuber.sso.dto.UserGroupEntity;
import org.cuber.sso.helper.SSOHelper;
import org.cuber.sso.mapper.UserGroupEntityMapper;
import org.cuber.sso.service.SSOUserGroupService;
import org.cuber.stub.sso.SSOUserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SSOUserGroupServiceImpl implements SSOUserGroupService {

    @Autowired(required = false)
    private UserGroupEntityMapper userGroupEntityMapper;

    @Override
    public List<SSOUserGroup> retrieveByUserId(String userId) {
        List<UserGroupEntity> userGroupEntities = userGroupEntityMapper.retrieveByUserId(userId);
        List<SSOUserGroup> result = null;
        if (CollectionUtils.isNotEmpty(userGroupEntities)) {
            result = userGroupEntities.stream()
                    .map(userGroupEntity -> SSOHelper.dto2Vo(userGroupEntity))
                    .collect(Collectors.toList());
        }
        return result;
    }
}
