package org.cuber.sso.service;

import org.cuber.sso.SSOConstant;
import org.cuber.sso.biz.SSOUserBizService;
import org.cuber.stub.StubConstant;
import org.cuber.stub.json.GsonHolder;
import org.cuber.stub.sso.LoginStyle;
import org.cuber.stub.sso.SSOUser;
import org.cuber.stub.util.Rsa4JsUtils;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.security.PrivateKey;
import java.util.Objects;

@Service
public class SSOAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private SSOUserBizService ssoUserBizService;

    @Autowired
    private ObjectFactory<HttpSession> httpSessionFactory;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        if (authentication.getCredentials() == null) {
            logger.debug("Authentication failed: no credentials provided");
            throw new BadCredentialsException(messages.getMessage(
                    "AbstractUserDetailsAuthenticationProvider.badCredentials",
                    "Bad credentials"));
        }
        LoginStyle loginStyle = fetchByAuthUserName(authentication.getPrincipal().toString());
        switch (loginStyle.getLoginType()) {
            case ding:
                break;
            case email:
                break;
            case phone:
                break;
            case wechat:
                break;
            case password:
                String presentedPassword = loginStyle.getPin();
                if (!passwordEncoder.matches(presentedPassword, userDetails.getPassword())) {
                    logger.debug("Authentication failed: password does not match stored value");
                    httpSessionFactory.getObject().removeAttribute(SSOConstant.LOGIN_STYLE);
                    throw new BadCredentialsException(messages.getMessage(
                            "AbstractUserDetailsAuthenticationProvider.badCredentials",
                            "认证失败"));
                }
                break;
            default:
        }
        httpSessionFactory.getObject().removeAttribute(SSOConstant.LOGIN_STYLE);
    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        try {
            LoginStyle loginStyle = fetchByAuthUserName(username);
            UserDetails loadedUser = ssoUserBizService.loadUser(fetchByLoginStyle(loginStyle));
            if (loadedUser == null) {
                throw new InternalAuthenticationServiceException(
                        "UserDetailsService returned null, which is an interface contract violation");
            }
            return loadedUser;
        } catch (UsernameNotFoundException ex) {
            throw ex;
        } catch (InternalAuthenticationServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new InternalAuthenticationServiceException(ex.getMessage(), ex);
        }
    }


    private LoginStyle fetchByAuthUserName(String userName) {
        HttpSession session = httpSessionFactory.getObject();
        LoginStyle loginStyle = (LoginStyle) session.getAttribute(SSOConstant.LOGIN_STYLE);
        if (Objects.isNull(loginStyle)) {
            PrivateKey privateKey = (PrivateKey) session.getAttribute(StubConstant.RSA_PRIVATE_KEY);
            loginStyle = GsonHolder.fromJson(Rsa4JsUtils.decrypt(userName, privateKey), LoginStyle.class);
            session.setAttribute(SSOConstant.LOGIN_STYLE, loginStyle);
        }
        return loginStyle;
    }

    private SSOUser fetchByLoginStyle(LoginStyle loginStyle) {
        SSOUser ssoUser = null;
        if (Objects.nonNull(loginStyle)) {
            ssoUser = new SSOUser();
            ssoUser.setDomain(SSOConstant.DEFAULT_DOMAIN);
            switch (loginStyle.getLoginType()) {
                case ding:
                    ssoUser.setDingOpenId(loginStyle.getIdentifier());
                    break;
                case email:
                    ssoUser.setEmail(loginStyle.getIdentifier());
                    break;
                case phone:
                    ssoUser.setMobile(loginStyle.getIdentifier());
                    break;
                case wechat:
                    ssoUser.setWxOpenId(loginStyle.getIdentifier());
                    break;
                case password:
                    ssoUser.setUserName(loginStyle.getIdentifier());
                    break;
            }
        }
        return ssoUser;
    }
}
