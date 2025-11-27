public class Demo1 {

    // Print even odd using multi-threading
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        Thread t1 = new Thread(()->evenOdd.Odd());  // lambda
        Thread t2 = new Thread(evenOdd::Even);      //method reference
        t1.start();
        t2.start();
    }

    static class EvenOdd{
        private int num=1;
        private final int limit =10;

        public synchronized void Odd()  {
            while (num<=limit){
                if (num%2==1){
                    System.out.println("Odd"+num);
                    num++;
                    notify();
                }else {
                   try {
                       wait();
                   } catch (InterruptedException e) {
                       System.out.println("Error");
                   }
                }
            }
        }

        public synchronized void Even() {
            while (num<=limit){
                if (num%2==0){
                    System.out.println("Even"+num);
                    num++;
                    notify();
                }else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                       System.out.println("Error");
                    }
                }
            }
        }
    }
}



