import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Number 1 :");
        double num1= scanner.nextDouble();

        System.out.println("Enter Number 2 :");
        double num2= scanner.nextDouble();

        System.out.println("Enter Operation");
        char operation=scanner.next().charAt(0);

double result = 0;

        switch (operation){
            case '+' -> result= num1+num2;
            case '-' -> result= num1-num2;
            case '*' -> result= num1*num2;
            case '/' -> result= num1/num2;
            case '%' -> result= num1%num2;
            default -> System.out.println("Invalid Operator");
        }
        System.out.println("Result : "+ result);

    }
}
