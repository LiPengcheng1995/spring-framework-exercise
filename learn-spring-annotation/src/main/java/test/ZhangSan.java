package test;

import org.springframework.beans.factory.annotation.Qualifier;
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
public class ZhangSan {


    @Resource(name = "buMd")
    private AAAA buMd;

    public AAAA getBuMd() {
        return buMd;
    }

    @Qualifier("auMd")
    public void setBuMd(AAAA auMd) {
        this.buMd = auMd;
    }
}
