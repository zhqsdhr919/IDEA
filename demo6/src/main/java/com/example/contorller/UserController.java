package com.example.contorller;

/**
 * Created by zhanghq on 2017/3/20.
 */

import cn.sh.ideal.dubbo.service.IHelloservice;
import com.example.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
@RequestMapping("user")
public class UserController {
    @Reference(version="1.0.0")
    IHelloservice helloservice;
    @RequestMapping("/{id}")
    public String view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("raysky");

        return helloservice.sayHello("hello" );
    }
}
