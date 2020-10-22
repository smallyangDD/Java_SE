package com.wsdaoy.work1.guanQia03;


import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        HashMap<String, Integer> allMap = new HashMap<>();
        ArrayList<String> pucks = new ArrayList<>();
        String[] dianShu = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] huaSe = {"♦", "♣", "♥", "♠"};
        for (String s : dianShu) {
            for (String s1 : huaSe) {
                pucks.add(s + s1);
            }
        }
        pucks.add("小🃏");
        pucks.add("大🃏");

        Iterator<String> it = pucks.iterator();
        int n = 0;
        while (it.hasNext()) {
            allMap.put(it.next(), n++);
        }

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() < 3) {
            int i = random.nextInt(54);
            if (!list.contains(i) && i != 53) { //不取最后一张牌
                list.add(i);
            }
        }

        //洗牌
        pucks = xiPai(pucks);
        ArrayList<String> newPuck = new ArrayList<>();

        ArrayList<String> diZhuPai = new ArrayList<>();

        for (int i = 0; i < pucks.size(); i++) {
            if (list.contains(i)){
                diZhuPai.add(pucks.get(i));
            }else {
                newPuck.add(pucks.get(i));
            }
        }

        System.out.println("地主牌：");
        System.out.println(diZhuPai);

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        Integer DZindex = null;

        for (int i = 0; i < (54 - 3); i++) {
            if (i % 3 == 0) {
                p1.add(newPuck.get(i));
            } else if (i % 3 == 1) {
                p2.add(newPuck.get(i));
            } else if (i % 3 == 2) {
                p3.add(newPuck.get(i));
            }
            //拥有大王牌的玩家index下标
            if ("大🃏".equals(newPuck.get(i))) {
                DZindex = i % 3;
            }
        }

        if (DZindex == 0) {
            for (String pai : diZhuPai) {
                p1.add(pai);
            }
        } else if (DZindex == 1) {
            for (String pai : diZhuPai) {
                p2.add(pai);
            }
        } else if (DZindex == 2) {
            for (String pai : diZhuPai) {
                p3.add(pai);
            }
        }

        //排序
        p1 = sortPuck(allMap,p1);
        p2 = sortPuck(allMap,p2);
        p3 = sortPuck(allMap,p3);

        System.out.println("玩家1：" + p1 + "，共" + p1.size() + "张牌");
        System.out.println("玩家2：" + p2 + "，共" + p2.size() + "张牌");
        System.out.println("玩家3：" + p3 + "，共" + p3.size() + "张牌");
    }

    private static ArrayList<String> xiPai(ArrayList<String> list) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int i1 = random.nextInt(54);

            String str = list.get(i);
            list.set(i, list.get(i1));
            list.set(i1, str);
        }

        return list;
    }

    private static ArrayList<String> sortPuck(HashMap<String, Integer> map, ArrayList<String> list) {
        ArrayList<Integer> tempList = new ArrayList<>();
        ArrayList<String> puckList = new ArrayList<>();

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            tempList.add(map.get(it.next()));
        }

        //排序
        Collections.sort(tempList);

        for (Integer i : tempList) {
            Set<String> kSet = map.keySet();
            for (String s : kSet) {
                if (i == map.get(s)) {
                    puckList.add(s);
                }
            }
        }

        return puckList;

    }
}
