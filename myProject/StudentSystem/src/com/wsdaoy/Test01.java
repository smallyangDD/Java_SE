package com.wsdaoy;

import com.wsdaoy.bean.ShowInfo;
import com.wsdaoy.bean.WriteReadToJson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test01 {
    static WriteReadToJson jo = new WriteReadToJson();
    public static void main(String[] args) {
        //读取用户赋值给当前所有学生的列表
        jo.setAllStudentList(jo.readLocalFileJson());
        Scanner sc = new Scanner(System.in);
        ShowInfo showInfo = new ShowInfo();
        showInfo.showControl(showInfo.FIEST_SHOW);
        String index1Cmd = sc.nextLine();
        while (!"end".startsWith(index1Cmd)){
            if("1".startsWith(index1Cmd)){
                showInfo.showControl(showInfo.ADD_COMMAND);
                String index2Cmd = sc.nextLine();
                while (!"0".startsWith(index2Cmd)){
                    if ("1".startsWith(index2Cmd)){
                        System.out.println("录入学生信息：");
                        createStudent("add");
                    } else if("2".startsWith(index2Cmd)){
                        System.out.println("输入要修改学生的信息：");
                        createStudent("change");
                    }else {
                        System.out.println("输入指令有误！");
                    }
                    showInfo.showControl(showInfo.ADD_COMMAND);
                    index2Cmd = sc.nextLine();
                }
            }else if("2".startsWith(index1Cmd)){
                showInfo.showControl(showInfo.SEARCH_COMMAND);
                String index2Cmd = sc.nextLine();
                while (!"0".startsWith(index2Cmd)){
                    if ("1".startsWith(index2Cmd)){
                        System.out.println("输入需要查找的学生id：");

                    } else if("2".startsWith(index2Cmd)){
                        //打印全部学生信息

                    }else {
                        System.out.println("输入指令有误！");
                    }
                    showInfo.showControl(showInfo.SEARCH_COMMAND);
                    index2Cmd = sc.nextLine();
                }
            }
            showInfo.showControl(showInfo.FIEST_SHOW);
            index1Cmd = sc.nextLine();
        }


        jo.writeToLocalFile();
        jo.readLocalFileJson();

    }
    private static void createStudent(String cs){
        Scanner sc = new Scanner(System.in);
        System.out.println("学生姓名：");
        String name = sc.nextLine();
        String id = null;
        if ("change".startsWith(cs)){
            System.out.println("学生id：");
            id = sc.nextLine();
        }
        System.out.println("学生年龄：");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("学生联系方式：");
        String phone = sc.nextLine();
        System.out.println("学生出生日期（格式：xxxx-xx-xx）：");
        String birthday = sc.nextLine();
        System.out.println("学生住址：");
        String addr = sc.nextLine();
        HashMap<String, Object> itemMap = jo.createItemMap(name, id, age, phone, birthday, addr);
        System.out.println(itemMap);
        jo.addItemToList(itemMap,cs);
    }

}
