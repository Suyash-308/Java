import java.util.Scanner;

public class LargeNum {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Num 1: ");
        int num1=scanner.nextInt();
        System.out.println("Num 2: ");
        int num2=scanner.nextInt();

        if (num1>num2){
            System.out.println("Number 1 is large");
        } else if (num1<num2) {
            System.out.println("Number 2 is large");
        }else {
            System.out.println("num1 and num2 equal");
        }

    }
}
