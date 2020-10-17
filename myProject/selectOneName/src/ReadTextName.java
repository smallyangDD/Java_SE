import java.io.*;
import java.util.ArrayList;

public class ReadTextName {

    public ReadTextName() {
    }

    public static ArrayList<String> rName () {
        ArrayList<String> rNameList = new ArrayList();
        File file = new File("name.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
//            一次读一行，读入null时文件结束
            while ((tempString = reader.readLine()) != null) {
                //把当前行号显示出来

                if(line > 1){
                    rNameList.add(tempString);
                }
//                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }


        return rNameList;
    }

}
