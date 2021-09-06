package spring.framework.exercise.domain.impl.school;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.framework.exercise.aop.haha;
import spring.framework.exercise.domain.Person;
import spring.framework.exercise.domain.School;

import javax.annotation.Resource;
import java.util.List;

/**
 * Package: spring.framework.exercise.domain.impl.school
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/10/23
 * Time: 20:23
 * Description:
 */
@Component
public class ASchool implements School, InitializingBean {
    //    @Value("${school.a.name}")
    private String schoolName;

    //    @Autowired
//    @Resource(name = "testBean")
//    @Resource
    private Person testBean;

    //    @Autowired
//    @Resource
    private Person teacher;

    //    @Autowired
    @Resource
    private List<Person> personList;

    @Resource
    private School ASchool;

    @haha
    @Override
    public String getName() {
//        return schoolName;
        ASchool.getPerson();
        return schoolName + JSON.toJSONString(this.getPerson());
    }

    @haha
    @Override
    public List<Person> getPerson() {
        return personList;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println();
    }
}
