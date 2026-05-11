import java.util.Scanner;

public class Demo3User {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number : ");

        int num= scanner.nextInt();
        boolean isPrime=true;
        for (int i = 2; i <=num/2 ; i++) {
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime?"Prime":"Not Prime");
    }
}
