import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter temp in celsius");
        double temp= scanner.nextDouble();

        double temp_F=(temp*9/5+32);

        System.out.println("Temperature is : "+ temp_F+" f");
    }
}
