import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/9/4
 * Time: 10:54
 * Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    protected ModelAndView handleRequestInternal(@PathVariable String id){
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setAge(100);
        return new ModelAndView("UserView","user",user);
    }
}
