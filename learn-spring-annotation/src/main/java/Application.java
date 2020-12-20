import com.alibaba.fastjson.JSON;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.AAAA;
import test.TestA;
import test.ZhangSan;

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
        ZhangSan a = applicationContext.getBean("zhangSan", ZhangSan.class);
        System.out.println(JSON.toJSONString(a));

        System.out.println(a.getBuMd().hashCode());
        AAAA b = applicationContext.getBean("buMd", AAAA.class);
        AAAA c = applicationContext.getBean("auMd", AAAA.class);

        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

    }
}
