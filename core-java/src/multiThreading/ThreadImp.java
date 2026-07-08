package multiThreading;

public class ThreadImp extends Thread{
    public static void main(String[] args) throws InterruptedException {
     ThreadImp threadImp=new ThreadImp();
     threadImp.start();
     threadImp.join();
        System.out.println("Main Thread");
    }

    @Override
    public void run() {
    for (int i=0;i<5;i++){
        System.out.println(i);
    }
    }

}
