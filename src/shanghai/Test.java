package shanghai;

/**
 * @author wnn
 * @date 2021/3/26-9:03
 * @descriptuion
 */
public class Test {
    public static void main(String[] args) {
        Account myac = new Account();
        User weixin = new User(myac,2000L);
        User ipay = new User(myac,2000L);
        Thread t_weixin = new Thread(weixin,"微信");
        Thread t_ipay = new Thread(ipay,"支付宝");
        t_weixin.start();
        t_ipay.start();


    }
}
class Account{
    public static Long money = 3000L;
    public synchronized void draw(Long m){
        String name = Thread.currentThread().getName();
        System.out.println(name+"正在操作，账户原有金额："+money);
        if (money<m){
            System.out.println(name+"正在操作，取款金额为："+m);
            System.out.println(name+"正在操作，余额不足，无法取款，账户余额为："+money);
        }else{
            money -= m;
            System.out.println(name+"正在操作，取款成功，余额为："+ money);
        }
    }
    public void drawing(Long m){
        synchronized (Account.class){
            String name = Thread.currentThread().getName();
            System.out.println(name+"正在操作，账户原有金额："+money);
            if (money<m){
                System.out.println(name+"正在操作，取款金额为："+m);
                System.out.println(name+"正在操作，余额不足，无法取款，账户余额为："+money);
            }else{
                money -= m;
                System.out.println(name+"正在操作，取款成功，余额为："+ money);
            }
        }

    }


}
class User implements Runnable{
    Account account;
    Long m;
    public User(Account account,Long m){
        this.account = account;
        this.m = m;
    }
    @Override
    public void run() {
//        if(Thread.currentThread().getName().equals("微信")){
//            account.draw(m);
//        }else {
//            account.drawing(m);
//        }
        account.drawing(m);
    }
}
