package multiThreading;

public class Demo2 {
    static void main() {
        Run run=new Run();
        Thread thread=new Thread(run);
        thread.start();
    }
}
class Run implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable");
    }
}
