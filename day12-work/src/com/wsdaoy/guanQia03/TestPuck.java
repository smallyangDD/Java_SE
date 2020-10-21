package com.wsdaoy.guanQia03;

import java.util.ArrayList;
import java.util.Random;

public class TestPuck {
    public static void main(String[] args) {
        ArrayList<String> pucks = new ArrayList<>();
        String[] dianShu = {"3","4","5","6","7","8","9","10","J","Q","k","A","2"};
        String[] huaSe = {"♦","♣","♥","♠"};
        for (String s : dianShu) {
            for (String s1 : huaSe) {
                pucks.add(s+s1);
            }
        }
        pucks.add("小🃏");
        pucks.add("大🃏");

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() < 3){
            int i = random.nextInt(54);
            if(!list.contains(i) && i != 53){ //不取最后一张牌
                list.add(i);
            }
        }

        pucks = xiPai(pucks);
        ArrayList<String> diZhuPai = new ArrayList<>();
        for (Integer i : list) {
            diZhuPai.add(pucks.get(i));
            pucks.remove(i);
        }

        System.out.println("地主牌：");
        System.out.println(diZhuPai);

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        Integer DZindex = null;

        for (int i = 0; i < (54-3); i++) {
            if(i%3 == 0){
                p1.add(pucks.get(i));
            }else if(i%3 == 1){
                p2.add(pucks.get(i));
            }else if(i%3 == 2){
                p3.add(pucks.get(i));
            }
            //拥有大王牌的玩家index下标
            if("大🃏".startsWith(pucks.get(i))){
                DZindex = i%3;
            }
        }

        if (DZindex == 0){
            for (String pai : diZhuPai) {
                p1.add(pai);
            }
        }else if (DZindex == 1){
            for (String pai : diZhuPai) {
                p2.add(pai);
            }
        }else if (DZindex == 2){
            for (String pai : diZhuPai) {
                p3.add(pai);
            }
        }

        System.out.println("玩家1："+p1+"，共"+p1.size()+"张牌");
        System.out.println("玩家2："+p2+"，共"+p2.size()+"张牌");
        System.out.println("玩家3："+p3+"，共"+p3.size()+"张牌");
    }

    private static ArrayList<String> xiPai(ArrayList<String> list){
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int i1 = random.nextInt(54 / 2);
            String str = list.get(i);
            list.set(i,list.get(i1));
            list.set(i1,str);
        }

        return list;
    }

    private static ArrayList<String> sortPuck(ArrayList<String> list){
        //整理玩家牌面，更好出牌
        list.sort((o1, o2) -> {
            Integer i1;
            Integer i2;
            try{
                i1 = Integer.parseInt(o1.substring(0,1));
                i2 = Integer.parseInt(o2.substring(0,1));
            }catch (NumberFormatException e){
                return 1;
            }
            return (i1-i2);
        });

        return list;
    }
}
