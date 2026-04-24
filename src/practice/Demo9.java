package practice;

public class Demo9 {
    public static void main(String[] args) {
        Runnable worker=()-> System.out.println("lambda way");
        worker.run();
    }
}
