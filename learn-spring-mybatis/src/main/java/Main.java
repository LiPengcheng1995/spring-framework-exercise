import com.alibaba.fastjson.JSON;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Reader;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Date: 2019-08-06
 * Time: 15:36
 * Description:
 */
public class Main {
    public static void main(String args[]){
        // 加载Spring
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        UserMapper userMapper = ac.getBean("userMapper",UserMapper.class);

        User user = new User();
        user.setBusinessId(123L);
        user.setCreator("lipengcheng1995");
        user.setModifier("lipengcheng1995");
        user.setTemplateId(456L);
        user.setFormName("just a test 1");

        Long insertResult = userMapper.insertUser(user);
        System.out.println("插入成功，返回的结果为："+insertResult);
        System.out.println("参数为："+JSON.toJSONString(user));

        User queryResult = userMapper.getById(user.getFormId());
        System.out.println(JSON.toJSONString(queryResult));

    }
}
