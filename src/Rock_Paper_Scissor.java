import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        while (true) {
            System.out.println("\n--- Rock Paper Scissors Game ---");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int userChoice = sc.nextInt();

            if (userChoice == 4) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (userChoice < 1 || userChoice > 4) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            int computerChoice = rand.nextInt(3) + 1;

            System.out.println("You chose: " + choices[userChoice - 1]);
            System.out.println("Computer chose: " + choices[computerChoice - 1]);

            // Decide winner
            if (userChoice == computerChoice) {
                System.out.println("Result: It's a Tie!");
            }
            else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
                System.out.println("Result: You Win!");
            }
            else {
                System.out.println("Result: Computer Wins!");
            }
        }

        sc.close();
    }
    }

