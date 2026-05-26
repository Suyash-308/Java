package multiThreading;

public class Demo_01 {
    public static void main(String[] args) {
        A a=new A();
        a.start();
    }
}
class A extends Thread{
    @Override
    public void run() {
        System.out.println("run method ");
    }
}
