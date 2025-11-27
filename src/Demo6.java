import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=scanner.nextInt();
       if (num%2==0){
           System.out.println("prime");
       }else {
           System.out.println("Not Prime");
       }
    }
}
