package multiThreading;

public class Demo5 {
    public static void main(String[] args)  {
        Runnable r=System.out::println;
        r.run();
    }
}
