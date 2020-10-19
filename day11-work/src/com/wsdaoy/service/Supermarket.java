package com.wsdaoy.service;

import com.wsdaoy.service.bean.Commodity;

import java.util.HashMap;

public interface Supermarket {
    void initControl();
    default void commodityShow(){
        System.out.println("-----------------------------------");
        System.out.println("     商品列表");
        Commodity commodity = new Commodity();
        commodity.addCommodity("001","少林核桃",15.5,"斤");
        commodity.addCommodity("002","尚康饼干",14.5,"包");
        commodity.addCommodity("003","移动硬盘",155.5,"个");
        commodity.addCommodity("004","优秀种子",159.5,"G");
        
        System.out.println("商品id      名称     单价    计价单位");

        for (int i = 0; i < commodity.getCommodityList().size(); i++) {
            HashMap<String, Object> item = commodity.getCommodityList().get(i);
            StringBuilder str = new StringBuilder();
            str.append(item.get("id"));
            str.append("        ");
            str.append(item.get("name"));
            str.append("    ");
            str.append(item.get("price"));
            str.append("     ");
            str.append(item.get("unit"));
            System.out.println(str);
        }

        System.out.println("-----------------------------------");
        System.out.println("请输入你的购买的商品项（输入格式：商品id-购买数量），输入end表示购买结束。");
    }
}
