package com.zohar.hello.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zohar.hello.dubbo.service.user.api.UserService;
import org.springframework.beans.factory.annotation.Value;

/**
 * Project:      hello-dubbo-service-user-provider
 * Class:        com.zohar.hello.dubbo.service.user.provider.api.impl.UserServiceImpl
 * Description:
 * Time:         2019/11/20 18:18
 *
 * @author zohar
 **/
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String syaHi() {
        return "Hello Dubbo, i am from port: " + port;
    }
}
