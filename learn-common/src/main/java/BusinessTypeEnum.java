import java.util.HashSet;
import java.util.Set;

public enum BusinessTypeEnum {

    WJ_PURCHASE_ORDER("万家采购订单", 1),
    WJ_COMMISS_ORDER("万家佣金订单", 2),
    JW_STRORE_ORDER("京旺专卖店订单", 3),
    @Deprecated
    JW_QR_SCAN_ORDER("京旺扫码订单", 4),
    O_CANG_ORDER("o仓订单", 5),
    @Deprecated
    WULIAO_ORDER("物料订单",6),
    @Deprecated
    WJ_SHOP_KEEPER_ORDER("万家店主下单",7),
    WJ_MODEL_MACHINE_ORDER("万家门店样机订单",8),
    ;

    private int code;

    private String desc;

    BusinessTypeEnum(String desc , int code) {
        this.desc = desc;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static Set<Integer> getTypeSet(){
        Set<Integer> typeSet = new HashSet<>();
        for (BusinessTypeEnum value : BusinessTypeEnum.values()) {
            typeSet.add(value.getCode());
        }
        return typeSet;
    }
}
