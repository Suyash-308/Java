package multiThreading;

public class Demo4 {
    static void main() {
        Runnable r=()-> System.out.println("Lambda-Way");
        r.run();
    }
}
