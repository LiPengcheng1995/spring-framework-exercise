package spring.framework.exercise.custome.parse;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import spring.framework.exercise.custome.parse.domain.User;

/**
 * Package: spring.framework.exercise.custome.parse
 * User: 李鹏程
 * Email: lipengcheng1995@gmail.com
 * Date: 2019-06-06
 * Time: 17:42
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("Spring-test.xml"));
        User user = (User) xmlBeanFactory.getBean("zhangsan");
        System.out.println("姓名: " + user.getUserName() + "  ,  邮箱：" + user.getEmail());
    }
}
