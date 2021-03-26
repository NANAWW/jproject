package test;

/**
 * @author wnn
 * @date 2021/3/23-18:43
 * @descriptuion 实现饿汉式单例模式
 */
public class Single {
    private static final Single singleton = new Single();
    private Single(){
    }
    public static Single getInstance(){
        return singleton;
    }
}
