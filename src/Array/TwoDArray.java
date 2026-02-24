package Array;

import java.util.Scanner;

public class TwoDArray {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int column=scanner.nextInt();

        int [] [] numbers=new int[row][column];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                  numbers[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }

}
