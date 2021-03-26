package test;

/**
 * @author wnn
 * @date 2021/3/23-19:03
 * @descriptuion 懒汉单例模式
 */
public class LazySingle {

    private static LazySingle instance = null;
    private LazySingle(){}
    synchronized public static LazySingle getInstance(){
        if(instance == null){
            synchronized (LazySingle.class){
                instance = new LazySingle();
            }
        }
        return instance;
    }

}

