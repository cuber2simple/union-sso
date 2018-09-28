package org.cuber.sso.service;

import org.cuber.sso.vo.LoginLogVo;

public interface LoginLogService {

    void login(LoginLogVo loginLog);

    void logout(String loginId);

    LoginLogVo findById(String loginId);
}
