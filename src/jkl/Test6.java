package jkl;

import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * @author wnn
 * @date 2021/3/25-11:18
 * @descriptuion 文件的随机读写
 */
public class Test6 {
    public static void main(String[] args) throws Exception {
        //testRandomAccessFileRead();
        testRandomAccessFileWrite();
    }
    public static void testRandomAccessFileRead()throws Exception {
        //参数1是访问路径，参数2是mode，访问模式
        RandomAccessFile ra = new RandomAccessFile("F:\\javaproject\\jproject\\src\\jkl\\jkl.txt", "r");
        //设置读取文件内容的起始点
        ra.seek(4);
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = ra.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
        ra.close();
    }
    public static void testRandomAccessFileWrite()throws Exception{
        //参数1是访问路径，参数2是mode，访问模式
        RandomAccessFile ra = new RandomAccessFile("F:\\javaproject\\jproject\\src\\jkl\\jkl.txt","rw");
        //设置写入文件内容的起始点，0从开头写，ra.length是文件的追加
        //如果是在开头或者中间位置追加，会覆盖更长的原有内容
        ra.seek(ra.length());
        ra.write("hello!!".getBytes(StandardCharsets.UTF_8));
        ra.close();
    }
}
