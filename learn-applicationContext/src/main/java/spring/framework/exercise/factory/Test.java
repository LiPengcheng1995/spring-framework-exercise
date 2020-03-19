package spring.framework.exercise.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Package: spring.framework.exercise.factory
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2020/3/17
 * Time: 17:59
 * Description:
 */
@Component
public class Test {
    @Bean
    public Object haha(){
        System.out.println("调用 haha 一次");
        return new Object();
    }

    @Bean
    public Object hehe(){
        System.out.println("调用 hehe 一次");
        return haha();
    }
}
