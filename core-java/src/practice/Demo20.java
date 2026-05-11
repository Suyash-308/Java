package practice;

public class Demo20 extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + i);
            }
        }

        public static void main(String[] args) {
            Demo20 demo20= new Demo20();
            demo20.start(); // starts new thread

            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread: " + i);
            }
        }
    }
