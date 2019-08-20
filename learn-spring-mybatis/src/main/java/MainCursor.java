import com.alibaba.fastjson.JSON;
import domain.User;
import org.mybatis.spring.batch.MyBatisCursorItemReader;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019-08-12
 * Time: 10:14
 * Description:
 */
public class MainCursor {
    public static void main(String args[]) throws Exception {
        // 加载Spring
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        MyBatisCursorItemReader cursorReader = ac.getBean("myMyBatisCursorItemReader", MyBatisCursorItemReader.class);

        //打开
        cursorReader.open(new ExecutionContext());
        User user;
        int i = 0;
        while ((user = (User) cursorReader.read()) != null) {
            System.out.println(++i + "=" + JSON.toJSONString(user));
        }
        cursorReader.close();
    }
}
