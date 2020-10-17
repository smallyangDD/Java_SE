package com.wsdaoy;

import com.wsdaoy.bean.WriteToJson;

import java.util.ArrayList;
import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        //用户的信息可以录用
        WriteToJson jo = new WriteToJson("阿道","19192500",23,"13521420151","1995-9-15","广州厦滘");
        //学生集合的数组
        ArrayList<HashMap<String, Object>> tempJ = jo.addItemToList();
        jo.writeToLocalFile();
        jo.readLocalFileJson();
        System.out.println(tempJ);


    }
}
