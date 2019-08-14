import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
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
        userTemplate.getByCreator("sam01").stream().forEach(Main::print);

        User user = new User();
        user.setBusinessId(123L);
        user.setCreator("lipengcheng1995");
        user.setModifier("lipengcheng1995");
        user.setTemplateId(456L);
        user.setFormName("just a test");
        System.out.println("插入之后生成的主键是："+userTemplate.saveUser(user));


    }
    public static void print(User temp){
        System.out.println(JSON.toJSONString(temp));
    }
}
