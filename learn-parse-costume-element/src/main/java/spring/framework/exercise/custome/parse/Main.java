package spring.framework.exercise.custome.parse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.framework.exercise.custome.parse.domain.User;

/**
 * Package: spring.framework.exercise.custome.parse
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019-06-06
 * Time: 17:42
 * Description:
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-test.xml");
        User user = (User) context.getBean("zhangsan");
        System.out.println("姓名: "+ user.getUserName()+"  ,  邮箱："+user.getEmail());
    }
}
