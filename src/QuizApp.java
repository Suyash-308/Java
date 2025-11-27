import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Question {
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    int correctAnswer;

    Question(String q, String o1, String o2, String o3, String o4, int ans) {
        question = q;
        option1 = o1;
        option2 = o2;
        option3 = o3;
        option4 = o4;
        correctAnswer = ans;
    }
}

public class QuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> questions = Arrays.asList(
                new Question("Who invented Java?", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", "Guido Van Rossum", 1),
                new Question("Which company developed Java?", "Google", "Microsoft", "Sun Microsystems", "Amazon", 3)
        );

        int score = 0;

        for (Question q : questions) {
            System.out.println("\n" + q.question);
            System.out.println("1. " + q.option1);
            System.out.println("2. " + q.option2);
            System.out.println("3. " + q.option3);
            System.out.println("4. " + q.option4);

            System.out.print("Your answer: ");
            int ans = sc.nextInt();

            if (ans == q.correctAnswer) {
                System.out.println("✔ Correct!");
                score++;
            } else {
                System.out.println("✘ Wrong!");
            }
        }

        System.out.println("\nYour Score: " + score + "/" + questions.size());
    }


}
