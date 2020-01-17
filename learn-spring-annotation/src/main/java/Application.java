import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.TestA;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2020/1/17
 * Time: 17:07
 * Description:
 */
public class Application {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        TestA a = applicationContext.getBean("testA", TestA.class);
        System.out.println();

    }
}
