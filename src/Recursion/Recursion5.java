package Recursion;

public class Recursion5 {
    static void main() {
        int n=8;
        int ans=calcFactorial(n);
        System.out.println(ans);
    }
    public static int calcFactorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        int fact=calcFactorial(n-1);
        int fact_n=n*fact;
        return fact_n;
    }
}
