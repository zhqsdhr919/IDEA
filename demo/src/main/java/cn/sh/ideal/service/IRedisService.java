package cn.sh.ideal.service;

import java.util.List;

/**
 * Created by zhanghq on 2017/3/19.
 */
public interface IRedisService {

    public boolean set(String key, String value);

    public String get(String key);

    public boolean expire(String key,long expire);

    public boolean setAndExpire(String key, String value,long expire);

}
