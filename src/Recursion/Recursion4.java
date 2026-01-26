package Recursion;

public class Recursion4 {
    static void main() {
        sumOfNum( 1,5,0);
    }

    public static void sumOfNum(int i,int n,int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumOfNum(i+1,n,sum);
    }
}
