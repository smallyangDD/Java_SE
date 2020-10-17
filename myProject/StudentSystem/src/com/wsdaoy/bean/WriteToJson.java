package com.wsdaoy.bean;

import com.alibaba.fastjson.JSONObject;
import com.wsdaoy.util.JsonUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WriteToJson{
    //写数输入到json文件中
    private String sname;
    private String sid;
    private int age;
    private String phone;
    private String birthday;
    private String addr;
    private ArrayList<HashMap<String,Object>> allStudentList = new ArrayList<>();




    public WriteToJson() {

    }


    public WriteToJson(String sname, String sid, int age, String phone, String birthday, String addr) {
        this.sname = sname;
        this.sid = sid;
        this.age = age;
        this.phone = phone;
        this.birthday = birthday;
        this.addr = addr;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public ArrayList<HashMap<String, Object>> getAllStudentList() {
        return allStudentList;
    }

    public void setAllStudentList(ArrayList<HashMap<String, Object>> allStudentList) {
        this.allStudentList = allStudentList;
    }


    private HashMap<String,Object> createJson(){
        HashMap<String, Object> jObj = new HashMap<>();
        JsonUtils jsU = new JsonUtils();
        jObj.put("name",sname);
        jObj.put("age",age);
        jObj.put("phone",phone);
        jObj.put("birthday",birthday);
        jObj.put("addr",addr);
        String jsonString = jsU.getJsonString(jObj);

        return jObj;
    }

    public ArrayList<HashMap<String,Object>> addItemToList() {
        allStudentList.add(createJson());

        return allStudentList;
    }

    public void writeToLocalFile(){
        //打开文件流
        File newFile = new File("./studentList_baseFile.json");
        JsonUtils json = new JsonUtils();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(newFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        String jsonString = json.getJsonString(allStudentList);
        try {
            osw.write(jsonString);
            osw.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public ArrayList<HashMap<String,Object>> readLocalFileJson(){
        ArrayList<HashMap<String,Object>> rFileToArr = new ArrayList<>();
        //打开文件流
        File file = new File("./studentList_baseFile.json");
        JsonUtils json = new JsonUtils();
        BufferedReader reader = null;
        String tempStr = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((tempStr = reader.readLine()) != null){
                tempStr += tempStr.trim();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<JSONObject> rJsonToArr = json.getJsonArrayByJsonString(tempStr);

        for (int i = 0;i<rJsonToArr.size();i++) {
            JSONObject obj = rJsonToArr.get(i);
            HashMap<String,Object> tempMap = new HashMap<>();
            tempMap.put("name",obj.get("name").toString());
            int age = (int) obj.get("age");
            tempMap.put("age",age);
            tempMap.put("sid",obj.get("sid").toString());
            tempMap.put("phone",obj.get("phone").toString());
            tempMap.put("birthday",obj.get("birthday").toString());
            tempMap.put("addr",obj.get("addr").toString());

            rFileToArr.add(tempMap);
            System.out.println(tempMap);
        }
        return rFileToArr;
    }
}
