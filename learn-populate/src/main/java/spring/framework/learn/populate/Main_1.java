package spring.framework.learn.populate;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import spring.framework.learn.populate.domain.A;

/**
 * Package: spring.framework.learn.populate
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019-06-14
 * Time: 16:29
 * Description:
 */
public class Main_1 {
    public static void main(String[] args){
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("Learn-Populate-1.xml"));
        A a = (A) xmlBeanFactory.getBean("a");
        System.out.println(a.getField_a_1());
        System.out.println(a.getField_a_2());
        System.out.println(a.getField_a_3());
        System.out.println(a.getB().getField_b_1());
    }
}
