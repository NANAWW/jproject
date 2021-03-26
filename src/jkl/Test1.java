package jkl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wnn
 * @date 2021/3/24-15:44
 * @descriptuion
 */
public class Test1 {
    /**
     * 文件字符输入流FileReader
     * @param args
     */
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\test.txt");
            char[] c = new char[100];
            int len = 0;
            while((len = fr.read(c))!=-1){
                System.out.println(new String(c,0,len));
            }
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    /**
     * 测试字节输出流
     */
    public static void tsstout() {
        try{
            FileOutputStream out = new FileOutputStream("C:\\Users\\HP\\Desktop\\test.txt",true);
            String str = "daydayup";
            //把数据写到内存
            out.write(str.getBytes());
            //把内存中的数据刷写到硬盘
            out.flush();
            //关闭流
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * 测试文件字节输入流
     */
    public static void testin() {
        try{
            FileInputStream in = new FileInputStream("C:\\Users\\HP\\Desktop\\test.txt");
            //字节流，设置一个byte数组结束欧读取文件的内容
            byte[] b = new byte[100];
            //read方法返回值是读取数据的长度，当文件读取完毕，还会向后读取，这时返回值为-1
            //返回值为-1说明文件读取完毕
            int len = 0;
            while((len = in.read(b))!=-1){
                System.out.println(new String(b,0,len));
            }

            //流在使用完毕后需要关闭！
            in.close();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
