import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int num = random.nextInt(10)+1 ;
        int guess = 0;

        while (guess != num) {
            System.out.println("guess number 1-10");
            guess = sc.nextInt();

            if (guess > num) {
                System.out.println("Too high! Try again.");
            } else if (guess < num) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! 🎉");
            }
        }
    }
}
