package org.cuber.sso.service.impl;

import org.apache.commons.collections4.CollectionUtils;
import org.cuber.sso.dto.Resource;
import org.cuber.sso.helper.SSOHelper;
import org.cuber.sso.mapper.ResourceMapper;
import org.cuber.sso.service.SSOResourceService;
import org.cuber.stub.sso.SSOResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SSOResourceServiceImpl implements SSOResourceService {

    @Autowired(required = false)
    private ResourceMapper resourceMapper;

    @Override
    public List<SSOResource> retrieveByRoleId(String roleId) {
        List<SSOResource> result = null;
        List<Resource> resources = resourceMapper.retrieveByRoleId(roleId);
        if (CollectionUtils.isNotEmpty(resources)) {
            result = resources.stream()
                    .map(resource -> SSOHelper.dto2Vo(resource))
                    .collect(Collectors.toList());
        }
        return result;
    }
}
