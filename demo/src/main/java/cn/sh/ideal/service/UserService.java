package cn.sh.ideal.service;

import cn.sh.ideal.bean.User;
import cn.sh.ideal.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhanghq on 2017/3/19.
 */
public interface  UserService {
    public String  addUser(User user);
    public User findUser(String username);
}
