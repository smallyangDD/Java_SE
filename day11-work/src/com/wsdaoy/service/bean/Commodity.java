package com.wsdaoy.service.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class Commodity {
    private String id;
    private String name;
    private double price;
    private String unit;

    private static ArrayList<HashMap<String, Object>> commodityList = new ArrayList<>();

    public Commodity() {
    }


    public ArrayList<HashMap<String, Object>> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(ArrayList<HashMap<String, Object>> commodityList) {
        this.commodityList = commodityList;
    }

    public void addCommodity(String id, String name, double price, String unit){
        HashMap<String, Object> Obj = new HashMap<>();
        Obj.put("id",id);
        Obj.put("name",name);
        Obj.put("price",price);
        Obj.put("unit",unit);
        getCommodityList().add(Obj);
    }

}
