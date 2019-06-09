package spring.framework.exercise.custome.parse;

import com.sun.xml.internal.bind.v2.util.XmlFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
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
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("Spring-test.xml"));
        User user = (User) xmlBeanFactory.getBean("zhangsan");
        System.out.println("姓名: "+ user.getUserName()+"  ,  邮箱："+user.getEmail());
    }
}
