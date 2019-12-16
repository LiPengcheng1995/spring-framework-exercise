package spring.framework.exercise;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Package: PACKAGE_NAME
 * spring.framework.exercise.User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/9/4
 * Time: 10:54
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    protected String hahaha(@PathVariable String id){
        User user = new User();
        user.setId(id);
        user.setName("zhangsan");
        user.setAge(100);
        return JSON.toJSONString(user);
    }
}
