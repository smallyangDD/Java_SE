package com.wsdaoy.bean;

public class ShowInfo {
    public final int FIEST_SHOW = 0;
    public final int ADD_COMMAND = 1;
    public final int SEARCH_COMMAND = 2;
    static {
        System.out.println("\t\t欢迎使用学生信息管理系统");
    }
    public void showControl(int cmd){
        String str = "----------------------------------------------------";
        switch (cmd){
            case 0:
                System.out.println(str);
                System.out.println("1.录入学生信息\t\t\t2.查找学生信息   end.退出系统");
                System.out.println("请输入指定的命令进行操作：");
                break;
            case 1:
                System.out.println("1.新增学生信息\t\t\t2.修改学生信息  0.返回主菜单");
                System.out.println(str);

                break;
            case 2:
                System.out.println("1.查看指定学生\t\t\t2.打印全部学生信息  0.返回主菜单");
                System.out.println(str);
                break;

            default:break;
        }

    }

}
