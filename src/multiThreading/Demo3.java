package multiThreading;

public class Demo3 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous-Way");
            }
        };
        runnable.run();
    }
}

