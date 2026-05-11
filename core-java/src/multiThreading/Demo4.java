package multiThreading;

public class Demo4 {
    public static void main(String[] args)  {
        Runnable r=()-> System.out.println("Lambda-Way");
        r.run();
    }
}
