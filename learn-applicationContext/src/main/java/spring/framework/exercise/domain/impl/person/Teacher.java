package spring.framework.exercise.domain.impl.person;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.framework.exercise.domain.Person;

/**
 * Package: spring.framework.exercise.domain.impl.person
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/10/23
 * Time: 20:23
 * Description:
 * @date 2020-03-20 17:26
 * @author lipengcheng3
 */
@Order(2)

@Component
public class Teacher implements Person {
    @Override
    public String getName() {
        return "我是一个老师";
    }

    @Override
    public String work() {
        return "讲课";
    }
}
