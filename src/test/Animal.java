package test;

/**
 * @author wnn
 * @date 2021/3/23-19:31
 * @descriptuion
 */
public abstract class Animal {
    public int i=1;
    public abstract void test();
}
class Dog extends Animal{
    int i = super.i;
    {
        System.out.println(i);
    }
    @Override
    public void test() {
        System.out.println("dog");
    }

}