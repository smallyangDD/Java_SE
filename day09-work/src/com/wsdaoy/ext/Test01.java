package com.wsdaoy.ext;


import com.wsdaoy.service.MatchStr;
import com.wsdaoy.service.impl.Command;
import com.wsdaoy.service.impl.ResultMsg;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        while (true){
            MatchStr rm = new ResultMsg();
            Scanner sc = new Scanner(System.in);
            Command command = new Command();
            command.exterior();

            String getStr = sc.nextLine();
            if(getStr.startsWith("")){
                System.out.println("请输入指令内容！！\n");
            }

            if(getStr.startsWith("roll")){
                command.roll();
            }
            else if(rm.matchString(getStr,"周免")){
                command.LoL();

            }
            if(rm.matchString(getStr,"点歌")){
                command.music();
            }

            if (rm.matchString(getStr,"exit")){
                break;
            }

        }


    }
}
