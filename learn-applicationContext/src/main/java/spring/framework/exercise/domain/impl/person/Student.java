package spring.framework.exercise.domain.impl.person;

import org.springframework.stereotype.Component;
import spring.framework.exercise.domain.Person;

/**
 * Package: spring.framework.exercise.domain.impl.person
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/10/23
 * Time: 20:23
 * Description:
 */
@Component
public class Student implements Person {
    @Override
    public String getName() {
        return "我是一个学生";
    }

    @Override
    public String work() {
        return "学习";
    }
}
