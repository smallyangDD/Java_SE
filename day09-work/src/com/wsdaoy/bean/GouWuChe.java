package com.wsdaoy.bean;

import java.util.ArrayList;

public class GouWuChe {
    public static ArrayList<Goods> goods = new ArrayList<>();

    public void addGoods(Goods goods) {

        this.goods.add(goods);
        System.out.println("加入 " + goods.getName() + " 成功");
    }

    public void showGoods() {
        System.out.println("===========打印商品==========");
        System.out.println("您选购的商品为：");
        for (int i = 0; i < goods.size(); i++) {
            System.out.print("    ");
            System.out.println(goods.get(i).getId() + "," + goods.get(i).getName() + "," + goods.get(i).getPrice());
        }
    }

    public void total() {
        System.out.println("----------------");
        countMoney();
    }

    private void countMoney() {
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < goods.size(); i++) {
            sum += goods.get(i).getPrice();
            if (goods.get(i) instanceof EGoods) {
                sum2 += goods.get(i).getPrice() * 0.88;
            } else {
                sum2 += goods.get(i).getPrice();
            }
        }
        System.out.println("原  价为：" + sum + "元");
        System.out.println("折后价为：" + sum2 + "元");
    }
}
