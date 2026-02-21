package multiThreading;

public class Demo3 {
    static void main() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous-Way");
            }
        };
        runnable.run();
    }
}

