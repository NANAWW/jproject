package shanghai;

import java.util.concurrent.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author wnn
 * @date 2021/3/26-10:34
 * @descriptuion
 */
public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个FutureTask对象，参数为Callable接口实现类对象
        //创建线程，传入参数FutureTask对象，然后启动线程
        FutureTask task = new FutureTask(new Callable() {
            //call方法相当于run方法
            @Override
            public Object call() throws Exception {
                System.out.println("call method begin!!!");
                Thread.sleep(1000*10);
                System.out.println("call method end!!!");
                int i = 100;
                return i;
            }
        });
        Thread tt = new Thread(task,"xcv");
        tt.start();
        System.out.println(task.get());

    }




}
