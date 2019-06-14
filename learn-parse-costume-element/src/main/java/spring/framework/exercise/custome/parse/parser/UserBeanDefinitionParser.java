package spring.framework.exercise.custome.parse.parser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import spring.framework.exercise.custome.parse.domain.User;

/**
 * Package: spring.framework.exercise.custome.parse.parser
 * User: 李鹏程
 * Email: lipengcheng1995@gmail.com
 * Date: 2019-06-06
 * Time: 17:48
 * Description:
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    public static final String ID = "id";

    public static final String XML_USER_NAME = "userName";

    public static final String XML_USER_EMAIL = "email";

    public static final String FIELD_USER_NAME = "userName";

    public static final String FIELD_USER_EMAIL = "email";


    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String userName = element.getAttribute(XML_USER_NAME);
        String email = element.getAttribute(XML_USER_EMAIL);

        if (StringUtils.hasLength(userName)){
            builder.addPropertyValue(FIELD_USER_NAME,userName);
        }

        if (StringUtils.hasLength(email)){
            builder.addPropertyValue(FIELD_USER_EMAIL,email);
        }
    }

}
