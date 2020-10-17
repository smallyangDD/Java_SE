import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class SelectName {

    private static boolean flag = true;

    public static void main(String[] args) throws IOException {

        final WriterTextCount wt = new WriterTextCount();
        final ReadTextName rt = new ReadTextName();
        wt.ifInFile();
        ArrayList<String> nameList = rt.rName();   //查询所有人list

        ArrayList<Integer> indexList = new ArrayList<>();
        ArrayList<String> countNum = new ArrayList<>();
        Pattern r = Pattern.compile("(\\d+)");  //创建正则匹配
        //取出点名次数
        for (int i = 0; i < nameList.size(); i++) {
            String temp = nameList.get(i);
            Matcher matcher1 = r.matcher(temp);
            if(matcher1.find()){
                //保存所有的list的index
                countNum.add(matcher1.group());
            }
        }
        int max = getMax(countNum);
        for (int i = 0; i < countNum.size(); i++) {
            if(max != parseInt(countNum.get(i)) && !flag){
                indexList.add(i);
            }else if(flag) {
                indexList.add(i);
            }
        }

        int index = indexList.get(getRandom(0, indexList.size()));  //点到名index

        String temp = nameList.get(index);
        //System.out.println("开始点名：");
        //去除多取内容
        System.out.println("*************");
        System.out.println(temp.replaceFirst("=(\\d+)",""));
        System.out.println("*************");
        Matcher matcher2 = r.matcher(temp);
        if (matcher2.find()) {
            String s = matcher2.replaceFirst(parseInt(matcher2.group()) + 1 + "");
            nameList.set(index, s);
        }
        wt.writerMsg(nameList);
    }

    private static int getMax(ArrayList<String> countNum) {
        int max = parseInt(countNum.get(0));
        for (int i = 0; i < countNum.size(); i++) {
            int ele = parseInt(countNum.get(i));
            if(flag && parseInt(countNum.get(0)) != ele){
                //数组中有不同的元素
                flag = false;
            }
            //取最大值
            max = max < ele ? ele : max;  //取最小值
        }
        return max;
    }

    private static int getRandom(int min, int max) {
        return (int) (Math.random()*(max-min)+min);
    }

}
