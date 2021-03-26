package jkl;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @author wnn
 * @date 2021/3/24-16:50
 * @descriptuion
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
        /**
         * 缓冲字节输入流
         */
        //文件字节输入流对象
        FileInputStream fi = new FileInputStream("F:\\javaproject\\jproject\\src\\jkl\\jkl.txt");
        //把文件字节输入流放到缓冲字节输入流对象
        BufferedInputStream br = new BufferedInputStream(fi);
        byte[] b = new byte[10];
        int len = 0;
        while ((len = br.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        br.close();
        fi.close();

    }
}
