import java.util.Scanner;

public class Factorial {
    static void main() {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number : ");
        int num= sc.nextInt();


        int fact=1;
        while (num!=0){
            fact=fact*num;
            num--;
        }
        System.out.println(fact);
    }
}
