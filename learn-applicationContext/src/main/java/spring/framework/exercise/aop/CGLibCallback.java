package spring.framework.exercise.aop;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Package: spring.framework.exercise.aop
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2020/1/17
 * Time: 17:25
 * Description:
 */
public class CGLibCallback implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String name = method.getName();
        System.out.println("调用前,methodName:{}"+name);
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("调用后,methodName:{}"+name);
        return result;
    }
}
