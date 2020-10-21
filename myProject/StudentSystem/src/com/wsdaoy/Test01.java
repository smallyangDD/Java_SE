package com.wsdaoy;

import com.wsdaoy.bean.ShowInfo;
import com.wsdaoy.bean.WriteReadToJson;

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
        //输入命令的判断
        while (!"end".equals(index1Cmd)){
            if("1".equals(index1Cmd)){
                showInfo.showControl(showInfo.ADD_COMMAND);
                String index2Cmd = sc.nextLine();
                while (!"0".equals(index2Cmd)){
                    if ("1".equals(index2Cmd)){
                        System.out.println("录入学生信息：");
                        jo.createStudent("add");
                    } else if("2".equals(index2Cmd)){
                        System.out.println("输入要修改学生的信息：");
                        jo.createStudent("change");
                    }else {
                        System.out.println("输入指令有误！");
                    }
                    showInfo.showControl(showInfo.ADD_COMMAND);
                    jo.writeToLocalFile();  //写入文件
                    index2Cmd = sc.nextLine();
                }
            }
            else if("2".equals(index1Cmd)){
                showInfo.showControl(showInfo.SEARCH_COMMAND);
                String index2Cmd = sc.nextLine();
                while (!"0".equals(index2Cmd)){
                    if ("1".equals(index2Cmd)){
                        System.out.println("输入需要查找的学生id：");

                    } else if("2".equals(index2Cmd)){
                        //打印全部学生信息
                        System.out.println(jo.showAllStudent());
                        System.out.println();
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

    }



}
