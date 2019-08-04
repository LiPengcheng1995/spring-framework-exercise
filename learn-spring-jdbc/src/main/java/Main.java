import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Date: 2019-07-31
 * Time: 20:41
 * Description:
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserTemplate userTemplate = ac.getBean("userTemplate",UserTemplate.class);
        List<User>  result = userTemplate.getByCreator("sam01");
        result.stream().forEach(Main::print);

    }
    public static void print(User temp){
        System.out.println(JSON.toJSONString(temp));
    }
}
