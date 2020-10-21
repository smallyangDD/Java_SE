package com.wsdaoy.ext;



import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import com.wsdaoy.util.ExcelUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        ExcelUtil excelUtil = new ExcelUtil();
        Workbook answer = excelUtil.getImportExcel("D:\\week1_answer.xls");
        Workbook myAnswer = excelUtil.getImportExcel("D:\\答题卡.xls");


        ArrayList<String> standardAnswerList = getAnswerList(answer);
        ArrayList<String> myAnswerList = getAnswerList(myAnswer);

        //截取掉多余的元素
        List<String> list = myAnswerList.subList(0, standardAnswerList.size());
        manageMyList(myAnswerList);

        double fs = getFSCompare(standardAnswerList, list);
        System.out.println("学生最终得分：" + fs);

    }

    //获取列表
    private static ArrayList<String> getAnswerList(Workbook answer) {
        ArrayList<String> answerList = new ArrayList<>();
        Sheet sheet = answer.getSheetAt(0);
        int n = 1; //第二个格子开始
        Row getRowContent = sheet.getRow(1);

        while (true) {
            if (null == getRowContent.getCell(n) || "".startsWith(getRowContent.getCell(n).toString().trim())) {
                break;
            }
            answerList.add(getRowContent.getCell(n).toString());

            n++;
        }
//        System.out.println("答案：" + answerList);

        return answerList;
    }

    //处理myAnswerList的元素
    private static ArrayList<String> manageMyList(ArrayList<String> list){
        Iterator<String> it = list.iterator();
        int n = 0;
        while (it.hasNext()){
            String item = it.next();
            //去除其他没用的字符
            item = item.replaceAll("[^A-z]","");
            list.set(n,item);
            n++;

        }
        return list;
    }

    //比较
    private static double getFSCompare(List<String> li1, List<String> li2) {
        int count = 0;
        for (int i = 0; i < li1.size(); i++) {
            String itme1 = li1.get(i).toLowerCase();
            String itme2 = li2.get(i).toLowerCase();

            if (itme1.length() == itme2.length()) { //长度一致
                int listNum = 0;
                char[] charList1 = itme1.toCharArray();
                char[] charList2 = itme2.toCharArray();
                for (char c1 : charList1) {
                    for (char c2:charList2){
                        if(c1 == c2){
                            listNum++;
                        }
                    }
                }
                if (listNum == itme1.length() && itme1.startsWith(itme2)){
                    count++;
                }
            }
        }
        return count * 4;
    }
}
