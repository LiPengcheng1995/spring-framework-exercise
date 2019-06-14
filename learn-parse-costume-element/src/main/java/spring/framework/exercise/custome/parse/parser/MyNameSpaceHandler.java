package spring.framework.exercise.custome.parse.parser;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Package: spring.framework.exercise.custome.parse.parser
 * User: 李鹏程
 * Email: lipengcheng1995@gmail.com
 * Date: 2019-06-06
 * Time: 17:59
 * Description:
 */
public class MyNameSpaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
