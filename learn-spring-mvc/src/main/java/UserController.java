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
public class UserController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        User user = new User();
        user.setName("张三");
        user.setAge(100);
        return new ModelAndView("UserView","user",user);
    }
}
