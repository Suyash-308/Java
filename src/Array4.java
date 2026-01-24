import java.util.Scanner;

public class Array4 {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size=scanner.nextInt();
        int[] array=new int[size];

        for (int i = 0; i <size ; i++) {
            System.out.println("Enter array element : ");
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter number whose find index : ");
        int x=scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
           if (array[i] == x){
               System.out.println("index of "+ x +" is : "+i);
           }
        }

    }
}
