package org.cuber;

import org.cuber.stub.conf.SecurityConf;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.cuber.sso.mapper")
@SpringBootApplication(exclude = SecurityConf.class)
public class SSOApplication {
    public static void main(String[] args) {
        SpringApplication.run(SSOApplication.class, args);
    }
}