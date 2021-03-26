package jkl;

/**
 * @author wnn
 * @date 2021/3/25-21:40
 * @descriptuion
 */
public class TestRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("实现Runnable接口！");
        for (int i = 0; i < 6; i++) {
            System.out.println("每天爱jkl"+i+"次哦！");
        }
    }
}
