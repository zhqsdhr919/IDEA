package cn.sh.ideal.dubbo.service;

/**
 * Created by zhanghq on 2017/3/20.
 */
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(version="1.0.0")
public class HelloService implements IHelloservice {

    public String  sayHello(String ss) {
        System.out.println("hello dubbo-" + ss);
        return ss;
    }

}
