package multiThreading;

public class Demo1 {
    public static void main(String[] args)  {
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
