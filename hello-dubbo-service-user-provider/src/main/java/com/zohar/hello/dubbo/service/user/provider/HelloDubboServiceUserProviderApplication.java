package com.zohar.hello.dubbo.service.user.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zohar
 */
@SpringBootApplication
public class HelloDubboServiceUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDubboServiceUserProviderApplication.class, args);
        Main.main(args);
    }

}
