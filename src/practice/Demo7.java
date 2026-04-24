package practice;

public class Demo7 {
    public static void main(String[] args) {
        City city=new City();
        city.run();
    }
}

class City implements Runnable {
    @Override
    public void run() {
        System.out.println("Traditional way");
    }
}

