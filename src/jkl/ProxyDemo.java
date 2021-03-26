package jkl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wnn
 * @date 2021/3/25-16:50
 * @descriptuion 动态代理类
 */
public class ProxyDemo implements InvocationHandler {
    //被代理的对象
    Object obj;
    public ProxyDemo(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"开始执行；");
        //执行的是指定代理对象的指定方法
        method.invoke(this.obj,args);

        System.out.println(method.getName()+"执行完毕；");

        return null;
    }
}
