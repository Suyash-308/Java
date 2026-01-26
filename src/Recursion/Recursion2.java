package Recursion;

public class Recursion2 {
    static void main() {
        int  n=5;
        printNum(n);
    }

    public static void  printNum(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
}
