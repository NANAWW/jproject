package jkl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author wnn
 * @date 2021/3/25-10:56
 * @descriptuion
 */

/**
 *
 */
public class Test5 {
    public static void main(String[] args) throws Exception {
        testSerialize();
        testDeserialize();
    }
    /**
     * 对象的序列化
     */
    public static void testSerialize()throws Exception {
        //定义对象的输出流，把对象的序列化之后的流放到指定的稳健者
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("F:\\javaproject\\jproject\\src\\jkl\\jkl.txt"));
        Person p = new Person();
        p.name="zhangsan";
        p.age = 29;
        out.writeObject(p);
        out.flush();//刷写数据到硬盘
        out.close();
    }
    /**
     * 对象的反序列化
     */
    public static void testDeserialize()throws Exception{
        //创建对象输入流对象，从指定文件中把对象序列化后的流读取出来
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("F:\\javaproject\\jproject\\src\\jkl\\jkl.txt"));
        Object obj = in.readObject();
        //对象类型强转
        Person p = (Person) obj;
        System.out.println(p.name);
        System.out.println(p.age);
        in.close();
    }
}
