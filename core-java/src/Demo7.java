public class Demo7 {
    public static void main(String[] args) {
        class A {
            public void m1(){
                System.out.println("Class-A");
            }
        }
        class Traditional extends A{
            public void m1() {
                System.out.println("Traditional-Way");
            }
        }
        A a=new Traditional();
        a.m1();


        A a1=new A(){
            public void m1(){
                System.out.println("Anonymous Way");
            }
        };
        a1.m1();


        //Lambda and Method ref use for only functional interface

    }
    }
