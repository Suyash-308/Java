package practice;

public class Demo21 {
    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();
        Thread thread1 = new Thread(()-> {
            try {
                printNum.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2 = new Thread(()-> {
            try {
                printNum.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}



    class PrintNum{

        int num=1;
        int limit=10;

        synchronized void printOdd() throws InterruptedException {
            while (num<=limit){
            if (num%2==0){
                wait();
            }else {
                System.out.println("Odd" + num);
                num++;
                notify();
            }
            }
        }

        synchronized void printEven() throws InterruptedException {
            while (num<=limit){
                if (num%2 !=0){
                    wait();
                }else {
                    System.out.println("Even" + num);
                    num++;
                    notify();
                }
            }
        }

    }

