package practice;

public class Demo1 {
    public static void main(String args[]){
        System.out.println( add(2,4));
        System.out.println( add(2,4,5));

    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
}
