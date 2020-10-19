package com.wsdaoy.service.impl;

import com.wsdaoy.service.Supermarket;
import com.wsdaoy.service.bean.Commodity;

import java.util.ArrayList;
import java.util.HashMap;

public class Shopping implements Supermarket {

    //购物信息
    private static ArrayList<HashMap<String, Object>> buyInfos = new ArrayList<>();

    public ArrayList<HashMap<String, Object>> getBuyInfos() {
        return buyInfos;
    }

    public void setBuyInfos(ArrayList<HashMap<String, Object>> buyInfos) {
        this.buyInfos = buyInfos;
    }

    @Override
    public void initControl() {
        System.out.println("请输入你要的进行的操作：");
        System.out.println("1:购物商品        2:结算并打印小票   3：退出系统");
    }

    public void addBuyCar(String s) { //购物车
        HashMap<String, Object> tempMap = new HashMap<>();

        String getId = s.substring(0, s.indexOf("-"));
        int getNum = Integer.parseInt(s.substring(s.indexOf("-") + 1));
        String getName = "";
        String getDangWei = "";
        boolean noHave = true;
        tempMap.put("id", getId);
        tempMap.put("weight", getNum);

        for (HashMap<String, Object> citem : new Commodity().getCommodityList()) {
            //判断id是否存在商品架中
            if (citem.get("id").toString().startsWith(getId)) {
                int n = 0;
                boolean flag = true;
                for (HashMap<String, Object> item : getBuyInfos()) {
                    //购物车已添加就进行替换
                    if (getId.startsWith(item.get("id").toString())) {
                        item.put("weight", getNum);
                        getBuyInfos().set(n, item);
                        flag = false;
                    }
                    n++;
                }
                if (flag) getBuyInfos().add(tempMap);

                getName = citem.get("name").toString();
                getDangWei = citem.get("unit").toString();
                noHave = false;
            }
        }
        //打印信息
        if (noHave) {
            System.out.println("您输入的商品id不存在，请重新输入！！");
        } else {
            System.out.println(getName + " 商品添加成功,数量为：" + getNum + getDangWei);
        }
    }

    public void showAllBuyInfo() {
        int countNum = 0;
        double money = 0;

        System.out.println("---------------------------------------");
        System.out.println("\t\t\t\t欢迎光临");
        System.out.println("名称         售价\t\t\t数量\t\t金额");
        System.out.println("---------------------------------------");
        for (int i = 0; i < buyInfos.size(); i++) {
            HashMap<String, Object> item = buyInfos.get(i);
            String tId = item.get("id").toString();
            for (HashMap<String, Object> citem : new Commodity().getCommodityList()) {
                //匹配商品
                if(citem.get("id").toString().startsWith(tId)){
                    countNum += Integer.parseInt(item.get("weight").toString());
                    double tempMoney = countNum * Double.parseDouble(citem.get("price").toString());
                    money += tempMoney;
                    String str = citem.get("name")+"      "+citem.get("price")+
                                    "\t\t"+item.get("weight")+"\t\t"+tempMoney;
                    System.out.println(str);
                }
            }

        }
        System.out.println("---------------------------------------");
        System.out.println(buyInfos.size()+"项商品");
        System.out.println("共计："+countNum+"件");
        System.out.println("共："+money+"元");
        System.out.println("---------------------------------------");

    }
}
