package practice;

public class Demo8 {
    public static void main(String[] args) {

        Runnable worker = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous way");
            }
        };
        worker.run();
    }
}