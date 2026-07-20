package oops;

public class DemoInheritance {

   public static void main(String[] args) {
        Demo d=new Demo1();
        d.voice();

    }


}
class Demo{
    public void voice(){
        System.out.println("music");
    }
}

class Demo1 extends Demo{
    public void dance(){
        System.out.println("dancing");
    }
}
