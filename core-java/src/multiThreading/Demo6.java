package multiThreading;

public class Demo6 extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child: " + i);
            }
        }

        public static void main(String[] args) throws Exception {
            Demo6 t = new Demo6();
            t.start();

            t.join(); // First execute run then main thread
            System.out.println("Main thread ends");
    }
}
