package org.cuber.sso.service.impl;

import org.cuber.sso.dto.LoginLog;
import org.cuber.sso.mapper.LoginLogMapper;
import org.cuber.sso.service.LoginLogService;
import org.cuber.sso.vo.LoginLogVo;
import org.cuber.stub.util.TransformUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired(required = false)
    private LoginLogMapper loginLogMapper;

    @Override
    public void login(LoginLogVo loginLogVo) {
        LoginLog loginLog = TransformUtils.copyP(loginLogVo, LoginLog.class);
        loginLogMapper.create(loginLog);
        loginLogVo.setId(loginLog.getId());
    }

    @Override
    public void logout(String loginId) {
        LoginLog loginLog = new LoginLog();
        loginLog.setId(loginId);
        loginLogMapper.logout(loginLog);
    }

    @Override
    public LoginLogVo findById(String loginId) {
        LoginLog loginLog = loginLogMapper.retrieveById(loginId);
        return TransformUtils.copyP(loginLog, LoginLogVo.class);
    }
}
