package Array;

import java.util.Scanner;

public class TwoDArray2 {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int column=scanner.nextInt();

        int [] [] numbers=new int[row][column];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                numbers[i][j]=scanner.nextInt();
            }
        }
        int x=scanner.nextInt();
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if (numbers[i][j]==x){
                    System.out.println("x found at location "+i+","+j);
                }
            }
        }
    }
}
