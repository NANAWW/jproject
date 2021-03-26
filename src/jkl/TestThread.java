package jkl;

/**
 * @author wnn
 * @date 2021/3/25-21:30
 * @descriptuion
 */
public class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println("多线程运行的任务");
        for (int i = 0; i < 5; i++) {
            System.out.println("每天爱你"+i+"次哦！");
        }
    }
}

