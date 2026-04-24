package practice;

public class Demo3 {
    public static void main(String[] args) {
         A a=new B();
         a.m1();
         a.m2();
    }
}
    abstract class A{
       abstract void m1();

       void  m2(){
           System.out.println("M-2");
       }
    }

    class B extends A{
        void m1(){
            System.out.println("M-1");
        }

    }

