/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2020/4/7
 * Time: 10:22
 * Description:
 */
public class TestEnum {
    public static void main(String[] args) {
        BusinessTypeEnum typeEnum = null;
        System.out.println("hh"+BusinessTypeEnum.JW_STRORE_ORDER);

        typeEnum = BusinessTypeEnum.valueOf(BusinessTypeEnum.JW_STRORE_ORDER.toString());
        System.out.println();

    }
}
