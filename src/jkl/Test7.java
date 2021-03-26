package jkl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author wnn
 * @date 2021/3/25-16:48
 * @descriptuion
 */
public class Test7 {
    public static void main(String[] args) {
        testpro test = new TestDomeImpl();
        test.test1();
        test.test2();
        /**
         * 在执行test12方法是需要加入一些东西
         * 在执行方法前打印方法开始执行
         * 在执行方法后需要
         */
        //创建代理对象
        InvocationHandler handler = new ProxyDemo(test);
        testpro t = (testpro) Proxy.newProxyInstance(handler.getClass().getClassLoader(),test.getClass().getInterfaces(),handler);
        t.test1();
        t.test2();
    }
}
