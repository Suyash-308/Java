package Recursion;

public class Recursion3 {
    static void main() {
        int n=1;
        printNum(n);
    }
    public static void printNum(int n){
        if (n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
}
