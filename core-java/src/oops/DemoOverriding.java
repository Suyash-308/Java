package oops;

public class DemoOverriding {
   public static void main(String[] args) {
        Ac a = new Ac();
        a.play();
    }
}
class Ab{
    void play(){
        System.out.println("cricket");
    }
}

class Ac extends Ab{
    @Override
    void play() {
        System.out.println("football");;
    }
}
