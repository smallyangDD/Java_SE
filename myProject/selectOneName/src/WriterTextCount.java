import java.io.*;
import java.util.Date;
import java.util.List;
import java.nio.charset.StandardCharsets;

public class WriterTextCount {
    Date d = new Date();
    File f = new File("name.txt");
    String[] nameList = new String[]{"杨登道=0", "黄华光=0", "陈业语=0","黄天水=0","曾勇=0"};


    void ifInFile() throws IOException {
        File f = new File("name.txt");
        if(!f.isFile()){    //创建初始化txt
            initText();
        }
    }

    public void writerMsg(List lists) throws IOException {   //写入对象

        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fop, StandardCharsets.UTF_8);
        writer.write("#"+d.toString()+"\r\n"); //时间修改时间
        for (int i = 0; i < lists.size(); i++) {
            writer.write(lists.get(i).toString());
            writer.write("\r\n");
        }

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        fop.close();
        // 关闭输出流,释放系统资源
    }

    public void initText() throws IOException {    //初始化txt

        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fop, StandardCharsets.UTF_8);
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        writer.write("#"+d.toString()+"\r\n"); //时间修改时间
        for (int i = 0; i < nameList.length; i++) {
            writer.write(nameList[i]);
            writer.write("\r\n");
        }

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        fop.close();
        // 关闭输出流,释放系统资源
    }

}
