package com.wsdaoy.bean;

import com.alibaba.fastjson.JSONObject;
import com.wsdaoy.util.JsonUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

public class WriteReadToJson {
    //写数输入到json文件中

    private static ArrayList<ItemStudent> allStudentList = new ArrayList<>();


    public ArrayList<ItemStudent> getAllStudentList() {
        return allStudentList;
    }

    public void setAllStudentList(ArrayList<ItemStudent> allStudentList) {
        this.allStudentList = allStudentList;
    }

    public ArrayList<ItemStudent> addItemToList(ItemStudent itemStu,String CS) {
        if ("add".startsWith(CS)){
            //添加学生信息
            allStudentList.add(itemStu);
        }else if ("change".startsWith(CS)){
            //修改学生信息（根据学生的ID）
            String getId = itemStu.id;
            int n = 0;
            for (ItemStudent item:allStudentList) {
                if (getId.startsWith(item.id)){
                    allStudentList.set(n,itemStu);
                }
                n++;
            }
        }
        return allStudentList;
    }

    //写入本地ArrayList转为json文件数据
    public void writeToLocalFile() {
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

    //读取json文件数据转为ArrayList
    public ArrayList<ItemStudent> readLocalFileJson() {
        ArrayList<ItemStudent> rFileToArr = new ArrayList<>();
        //打开文件流
        File file = new File("./studentList_baseFile.json");
        JsonUtils json = new JsonUtils();
        BufferedReader reader = null;
        StringBuilder strB = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempS = null;
            while ((tempS = reader.readLine()) != null) {
                strB.append(tempS.trim());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<JSONObject> rJsonToArr = json.getJsonArrayByJsonString(strB.toString());

        if(null != rJsonToArr){
            for (int i = 0; i < rJsonToArr.size(); i++) {
                JSONObject obj = rJsonToArr.get(i);
                int age = (int) obj.get("age");
                String id = null;
                try{
                    id = obj.get("id").toString();
                }catch (NullPointerException e){
                    id = null;
                }
                //包装学生->Object
                ItemStudent student = new ItemStudent(obj.get("name").toString(),id,age,
                        obj.get("phone").toString(),obj.get("birthday").toString(),obj.get("addr").toString());

                rFileToArr.add(student);
            }
        }
        //返回解析的java类型对象数组
        return rFileToArr;
    }

    public String showAllStudent(){
        StringBuilder sb = new StringBuilder();
        sb.append("打印全部学生的信息：");
        for (ItemStudent itemStudent : allStudentList) {
            sb.append("\n\t学号："+itemStudent.id);
            sb.append("， 姓名："+itemStudent.name);
            sb.append("， 年龄："+itemStudent.age);
//            sb.append("， 出生日期："+itemStudent.birthday);
            sb.append("， 电话："+itemStudent.phone);
            sb.append("， 地址："+itemStudent.addr);
        }

        return sb.toString();
    }

    public void createStudent(String cs){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ids = new ArrayList<>();
        String id = null;
        while("change".startsWith(cs)){
            System.out.println("输入已存在的学生id：");
            id = sc.nextLine();
            Iterator<ItemStudent> sit = allStudentList.iterator();
            while (sit.hasNext()){
                ItemStudent item = sit.next();
                ids.add(item.id);
            }
            System.out.println(ids);
            if(id.equals("end")){
                return;
            }
            if(ids.contains(id) ){
                break;
            }
            System.out.println("!!!-->>需要输入正确的id！<<--!!!");
        }
        System.out.println("学生姓名：");
        String name = sc.nextLine();
        if ("add".startsWith(cs)){
            System.out.println("学生id：");
            id = sc.nextLine();
        }
        System.out.println("学生联系方式：");
        String phone = sc.nextLine();

        System.out.println("学生出生日期（格式：xxxx-xx-xx）：");
        String birthday = sc.nextLine();
        //自动添加年龄


        System.out.println("学生住址：");
        String addr = sc.nextLine();

        ItemStudent itemStudent = new ItemStudent(name, id, 20, phone, birthday, addr);
        System.out.print("新添加学生信息：\t");
        System.out.println(itemStudent);
        addItemToList(itemStudent,cs);
    }

    private boolean isCheckInputValid(String ckStr){
        //拼接字符合法字符
        char[] legalCharArr = {'_','-','.',',','/','\\'};

        char[] chars = ckStr.toCharArray();

        for (char c : chars) {

        }

        if(ckStr.matches("\\D")){
            return true;
        }

        return false;
    }
}
