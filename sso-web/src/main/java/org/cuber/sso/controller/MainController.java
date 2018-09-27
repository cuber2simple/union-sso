package org.cuber.sso.controller;

import io.swagger.annotations.Api;
import org.apache.commons.codec.binary.Base64;
import org.cuber.sso.SSOConstant;
import org.cuber.stub.StubConstant;
import org.cuber.stub.controller.BaseController;
import org.cuber.stub.util.Rsa4JsUtils;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceType;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.WebAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.util.Objects;

@Api("SSO主要方法")
@Controller
public class MainController extends BaseController {

    @RequestMapping("/login.htm")
    public String login(ModelMap modelMap, HttpSession session, HttpServletRequest request) {
        String page = "login";
        AuthenticationException exception = (AuthenticationException) session.getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
        if (exception != null) {
            modelMap.addAttribute(StubConstant.LOGIN_PAGE_MSG, exception.getLocalizedMessage());
            modelMap.addAttribute(StubConstant.TYPE, StubConstant.AUTH_FAILED);
            session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
        }
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (Objects.isNull(authentication) ||
                !authentication.isAuthenticated() ||
                (authentication instanceof AnonymousAuthenticationToken)) {
            KeyPair keyPair = Rsa4JsUtils.generateKeyPair();
            Device device = DeviceUtils.getCurrentDevice(request);
            session.setAttribute(SSOConstant.DEVICE_PLATFORM, device.getDevicePlatform());
            DeviceType deviceType = DeviceType.NORMAL;
            if (device.isMobile()) {
                deviceType = DeviceType.MOBILE;
            } else if (device.isTablet()) {
                deviceType = DeviceType.TABLET;
            }
            session.setAttribute(SSOConstant.DEVICE_TYPE, deviceType);
            PrivateKey privateKey = keyPair.getPrivate();
            String publicKey = Base64.encodeBase64String(keyPair.getPublic().getEncoded());
            session.setAttribute(StubConstant.RSA_PRIVATE_KEY, privateKey);
            session.setAttribute(StubConstant.RSA_PUBLIC_KEY, publicKey);
            modelMap.addAttribute(StubConstant.RSA_PUBLIC_KEY, publicKey);
        } else {
            page = "redirect:/main";
        }
        return page;
    }
}
