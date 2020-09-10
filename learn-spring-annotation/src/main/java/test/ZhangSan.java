package test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/9/4
 * @Time: 14:45
 * @Description:
 */
@Component
@PropertySource(
        value = {"classpath:hahaha.properties"}
)
public class ZhangSan {


    @Resource(name = "buMd")
    private AAAA buMd;

    @Value("${hhh}")
    private String hh;

    public AAAA getBuMd() {
        return buMd;
    }

    @Qualifier("auMd")
    public void setBuMd(AAAA auMd) {
        this.buMd = auMd;
    }
}
