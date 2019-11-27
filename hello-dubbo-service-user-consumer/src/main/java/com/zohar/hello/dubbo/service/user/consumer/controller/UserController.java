package com.zohar.hello.dubbo.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zohar.hello.dubbo.service.user.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project:      hello-dubbo-service-user-consumer
 * Class:        com.zohar.hello.dubbo.service.user.consumer.controller.UserController
 * Description:
 * Time:         2019/11/20 18:56
 *
 * @author zohar
 **/
@RestController
public class UserController {
    @Reference(version = "${user.service.version}")
    private UserService userService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi() {
        return userService.syaHi();
    }
}
