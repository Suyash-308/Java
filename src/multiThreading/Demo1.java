package multiThreading;

public class Demo1 {
    static void main() {
     Animal animal=new Animal();
     animal.start();
    }
}
class Animal extends Thread{
    @Override
    public void run() {
        System.out.println("run method");
    }
}
