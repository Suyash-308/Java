import java.util.Scanner;

public class Demo1User {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number between -128 to 127");
      int a=  scanner.nextByte();
      System.out.println("you enter : "+a);
    }
}
