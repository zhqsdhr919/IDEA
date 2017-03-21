package cn.sh.ideal.service.Impl;

import cn.sh.ideal.bean.User;
import cn.sh.ideal.mapper.UserMapper;
import cn.sh.ideal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhanghq on 2017/3/19.
 */
@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserMapper userMapper;


    public String  addUser(User user) {
        return String.valueOf(userMapper.addUser(user));
    }

    public User findUser(String username) {
        return userMapper.findUser(username);
    }

}
