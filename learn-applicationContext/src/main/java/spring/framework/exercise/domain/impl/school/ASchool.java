package spring.framework.exercise.domain.impl.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
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
public class ASchool implements School {
    @Value("${school.a.name}")
    private String schoolName;

    @Autowired
//    @Resource
    private Person student;

    @Autowired
    //    @Resource
    private Person teacher;

    @Autowired
    //    @Resource
    private List<Person> personList;

    @Override
    public String getName() {
        return schoolName;
    }

    @Override
    public List<Person> getPerson() {
        return personList;
    }
}
