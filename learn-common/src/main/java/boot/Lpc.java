package boot;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Package: boot
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2020/4/7
 * Time: 11:24
 * Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(value = Lpcs.class)
public @interface Lpc {
    String value() ;
}
