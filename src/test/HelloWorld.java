package test;

public class HelloWorld {
    public static void main(String[] args) {
        A<String> a1 = new A<String>();
        a1.setKey("Estella");
        System.out.println(a1.getKey());
        A<Integer> a2 = new A<Integer>();
        a2.setKey(666);
        System.out.println(a2.getKey());
    }

    static class A<T>{
        private T key;
        public void setKey(T key){
            this.key = key;
        }

        public T getKey() {
            return this.key;
        }
    }

}
