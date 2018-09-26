package org.cuber.sso.service.impl;

import org.cuber.sso.dto.UserEntity;
import org.cuber.sso.helper.SSOHelper;
import org.cuber.sso.mapper.UserEntityMapper;
import org.cuber.sso.service.SSOUserService;
import org.cuber.stub.sso.SSOUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSOUserServiceImpl implements SSOUserService {

    @Autowired(required = false)
    private UserEntityMapper userEntityMapper;

    @Override
    public SSOUser retrieveUser(SSOUser ssoUser) {
        UserEntity userEntity = userEntityMapper.retrieveByUnique(SSOHelper.vo2Dto(ssoUser));
        return SSOHelper.dto2Vo(userEntity);
    }
}
