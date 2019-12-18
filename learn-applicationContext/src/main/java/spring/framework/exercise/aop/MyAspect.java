package spring.framework.exercise.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Package: spring.framework.exercise.aop
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/12/18
 * Time: 10:15
 * Description:
 */

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* spring.framework.exercise.domain.*.*(..))")
    public void pointCut(){

    }

    @Around("spring.framework.exercise.aop.MyAspect.pointCut()")
    public Object process(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("调用前");
        Object x = pjp.proceed();
        System.out.println("调用后");
        return x;
    }
}
