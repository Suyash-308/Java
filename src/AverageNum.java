import java.util.Scanner;

public class AverageNum {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Num1 : ");
        int num1=scanner.nextInt();
        System.out.println("Enter Num2 : ");
        int num2=scanner.nextInt();
        System.out.println("Enter Num3 : ");
        int num3=scanner.nextInt();

        double result=avg(num1,num2,num3);
        System.out.println(result);

    }
    public static double avg( int num1,int num2,int num3){
        return (num1+num2+num3)/3.0;
    }

}
