package jkl;

import java.io.Serializable;

/**
 * @author wnn
 * @date 2021/3/25-10:49
 * @descriptuion
 */
public class Person implements Serializable {
    /**
     * 一个表示序列化版本标识符的静态变量
     * 用来表明类的不同版本间的兼容性
     */
    private static final long serialVersionUID = 1L;
    String name;
    int age;

}
