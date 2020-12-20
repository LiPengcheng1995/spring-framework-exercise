package spring.framework.exercise.domain;

import org.springframework.stereotype.Component;

/**
 * Package: spring.framework.exercise.domain
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/10/23
 * Time: 20:20
 * Description:
 */
@Component
public interface Person {
    String getName();

    String work();
}
