package cn.sh.ideal.controller;

import cn.sh.ideal.bean.User;
import cn.sh.ideal.service.IRedisService;
import cn.sh.ideal.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhanghq on 2017/3/19.
 */
@RestController
@RequestMapping(value="/user")
public class UserController {

    private final Logger logger=LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Autowired
    private IRedisService redisService;

    @RequestMapping(value="/addUser")
    public String addUser(@RequestParam("username") String username, @RequestParam("password")String password){

        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
       // redisService.setAndExpire(username,password,60);

        return  userService.addUser(user);
    }


    @RequestMapping(value="/findUser/{username}")
    public User findUser(@PathVariable String username){
        String password=redisService.get(username);

        logger.info("password======"+password);
        return  userService.findUser(username);
    }

}
