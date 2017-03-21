package cn.sh.ideal.mapper;

import cn.sh.ideal.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhanghq on 2017/3/19.
 */
@Mapper
public interface UserMapper {

    int addUser(@Param("user") User user);

    User findUser(String username);
}
