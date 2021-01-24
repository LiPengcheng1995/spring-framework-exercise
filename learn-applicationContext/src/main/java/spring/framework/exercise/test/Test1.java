package spring.framework.exercise.test;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lipengcheng1995 Created date 2019-12-22 19:58
 **/
public class Test1 {
    public static void main(String[] args){
        String x = "{\n" +
                "              \"businessSource\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"orderType\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"orderBizType\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"channel\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"countyPromoterMark\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"cityId\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"townId\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"deptNo\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"dr\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"merchantName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"orderState\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"salerId\": {\n" +
                "                \"type\": \"long\"\n" +
                "              },\n" +
                "              \"pin\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"merchantId\": {\n" +
                "                \"type\": \"long\"\n" +
                "              },\n" +
                "              \"appId\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"invoiceType\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"shopId\": {\n" +
                "                \"type\": \"long\"\n" +
                "              },\n" +
                "              \"orderPayStatus\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"ocs\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"skuId\": {\n" +
                "                \"type\": \"long\"\n" +
                "              },\n" +
                "              \"cpsStatus\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"brandName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"townName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"substituteSku\": {\n" +
                "                \"type\": \"long\"\n" +
                "              },\n" +
                "              \"skuState\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"orderCreateTime\": {\n" +
                "                \"type\": \"date\"\n" +
                "              },\n" +
                "              \"serialState\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"orderCreatorType\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"upc\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"orderStatus2\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"provinceId\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"orderCancelTime\": {\n" +
                "                \"type\": \"date\"\n" +
                "              },\n" +
                "              \"brandId\": {\n" +
                "                \"type\": \"long\"\n" +
                "              },\n" +
                "              \"subDisplay\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"provinceName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"buinessFieldCode\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"projectId\": {\n" +
                "                \"type\": \"long\"\n" +
                "              },\n" +
                "              \"secondCategoryId\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"backTime\": {\n" +
                "                \"type\": \"date\"\n" +
                "              },\n" +
                "              \"buyerTel\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"salerName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"subOrderType\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"venderId\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"orderPayType\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"shopName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"firstCategoryId\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"thirdCategoryId\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"skuName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"cityName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"countyId\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"parentOrderId\": {\n" +
                "                \"type\": \"long\"\n" +
                "              },\n" +
                "              \"orderEndTime\": {\n" +
                "                \"type\": \"date\"\n" +
                "              },\n" +
                "              \"countyName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"address\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"backAmount\": {\n" +
                "                \"type\": \"double\"\n" +
                "              },\n" +
                "              \"invoiceMode\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"buyerName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"skuType\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"venderName\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "              },\n" +
                "              \"deliveryState\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"businessType\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"invoiceStatus\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"houseHoldStatus\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"jdOrderId\": {\n" +
                "                \"type\": \"long\"\n" +
                "              },\n" +
                "              \"orderCancelState\": {\n" +
                "                \"type\": \"integer\"\n" +
                "              },\n" +
                "              \"tradeId\": {\n" +
                "                \"type\": \"long\"\n" +
                "              }\n" +
                "            }";
        Map<String,Object> y = JSON.parseObject(x, HashMap.class);
        System.out.println();
    }
}
