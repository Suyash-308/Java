public class Demo5 {
    public static void main(String[] args) {
       Demo5 demo5=new Demo5();
       demo5.m1(); // Using reference .
       m2();   // Directly
       Demo5.m3();  //Using className
    }

    public void m1(){
        System.out.println("m1");
    }
    public static void m2(){
        System.out.println("m2");
    }
    public static void m3(){
        System.out.println("m3");
    }
}
