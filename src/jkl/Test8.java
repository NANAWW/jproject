package jkl;

/**
 * @author wnn
 * @date 2021/3/25-21:30
 * @descriptuion
 */
public class Test8 {
    public static void main(String[] args) {
//        Thread t0 = new TestThread();
//        t0.start();
        Thread t = new Thread(new TestRunnable());
        t.start();
        System.out.println("dfds'g");
        System.out.println("skdf");

    }
}
