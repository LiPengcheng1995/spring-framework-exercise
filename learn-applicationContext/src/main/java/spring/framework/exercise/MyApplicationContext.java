package spring.framework.exercise;

import com.alibaba.fastjson.JSON;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import spring.framework.exercise.domain.Person;
import spring.framework.exercise.domain.School;

import java.util.List;

/**
 * Package: spring.framework.exercise
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/10/23
 * Time: 20:08
 * Description:
 */
public class MyApplicationContext {
    public static void main(String args[]){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        School school = applicationContext.getBean("ASchool", School.class);
        System.out.println("取到学校: "+school.getName());
        List<Person> personList = school.getPerson();
        for (Person person : personList){
            System.out.println("-------------- 拿到人员： "+person.getName());
            System.out.println(JSON.toJSONString(person));
            System.out.println("-------------- 人员开始工作： "+person.work());

        }
    }
}