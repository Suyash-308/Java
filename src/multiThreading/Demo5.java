package multiThreading;

public class Demo5 {
    static void main() {
        Runnable r=System.out::println;
        r.run();
    }
}
