package org.cuber.sso.service.impl;

import org.apache.commons.collections4.CollectionUtils;
import org.cuber.sso.dto.RoleEntity;
import org.cuber.sso.helper.SSOHelper;
import org.cuber.sso.mapper.RoleEntityMapper;
import org.cuber.sso.service.SSORoleService;
import org.cuber.stub.sso.SSORole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SSORoleServiceImpl implements SSORoleService {

    @Autowired(required = false)
    private RoleEntityMapper roleEntityMapper;

    @Override
    public List<SSORole> retrieveByUserId(String userId) {
        List<SSORole> result = null;
        List<RoleEntity> roleEntities = roleEntityMapper.retrieveByUserId(userId);
        if (CollectionUtils.isNotEmpty(roleEntities)) {
            result = roleEntities.stream()
                    .map(roleEntity -> SSOHelper.dto2Vo(roleEntity))
                    .collect(Collectors.toList());
        }
        return result;
    }
}
