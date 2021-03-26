package shanghai;

/**
 * @author wnn
 * @date 2021/3/26-10:09
 * @descriptuion 生产者与消费者
 */
public class Test1 {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        //内部类实现生产者线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized (c){
                    //先开始无限的生产次数
                    while (true){
                        if(c.productNum==0){
                            System.out.println("产品数为0，开始生产");
                            while (c.productNum<10){
                                c.productNum += 1;

                                System.out.println(Thread.currentThread().getName()+"生产产品，产品数为"+c.productNum);
                            }
                            System.out.println("产品数为"+c.productNum+"结束生产活动");
                            //生产完毕，唤醒消费者线程
                            c.notify();
                        }else {
                            try {
                                //库存充足，生产者休息
                                c.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        },"生产者").start();
        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (c){
                    //先开始无限的消费次数
                    while (true){
                        if(c.productNum!=0){
                            System.out.println("产品数为"+c.productNum+"，开始消费");
                            while (c.productNum>0){
                                c.productNum -= 1;
                                System.out.println(Thread.currentThread().getName()+"消费产品，产品数为"+c.productNum);
                            }
                            System.out.println("产品数为"+c.productNum+"结束消费活动");
                            //消费完毕，唤醒消费者线程
                            c.notify();
                        }else{
                            try {
                                //库存不足，消费者等待
                                c.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "消费者").start();
    }
}

class Clerk{
    public static  int productNum = 0;
}
