package org.cuber.test;

import org.cuber.SSOApplication;
import org.cuber.sso.mapper.LoginLogMapper;
import org.cuber.sso.service.LoginLogService;
import org.cuber.sso.vo.LoginLogVo;
import org.cuber.sso.vo.LoginResult;
import org.cuber.stub.StubConstant;
import org.cuber.zk.XClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SSOApplication.class)
public class SplitTableTest {
    static{
        System.setProperty(StubConstant.ZOOKEEPER_ADDRESS, XClient.getZkConnectString());
    }
    @Autowired
    private LoginLogService loginLogService;

    @Autowired(required = false)
    private LoginLogMapper loginLogMapper;

    @Test
    public void loginLog() throws Exception {
        LoginLogVo loginLogVo = new LoginLogVo();
        loginLogVo.setDevice("abc");
        loginLogVo.setFailReason("差评");
        loginLogVo.setIdentifier("cuber");
        loginLogVo.setUserAgent("XP");
        loginLogVo.setLoginIp("127.0.0.1");
        loginLogVo.setLoginResult(LoginResult.success);
        loginLogVo.setTraceId("NVB");
        loginLogVo.setUserId("123");
        loginLogService.login(loginLogVo);
    }

    @Test
    public void select() throws Exception {
        LoginLogVo loginLogVo = loginLogService.findById("LL165815583969906688");
        System.out.println(loginLogVo);
    }

    @Test
    public void select2() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("startDate","2018-08");
        map.put("endDate","2018-09");
        loginLogMapper.retrievePage(map);

    }
}
