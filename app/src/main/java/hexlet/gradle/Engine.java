package hexlet.gradle;
import java.util.Scanner;
public class Engine {
    public static void gameLogic(String[] gameValues) {

        System.out.println("Welcome to the Brain Games!");
        Cli.greetByName();
        final int requiredCorrectAnswers = 3;

        System.out.println(gameValues[0]); //printing out rules
        int correctAnswers = 0;
        while (correctAnswers < requiredCorrectAnswers) {
            System.out.println(gameValues[correctAnswers * 2 + 1]); //printing out question
            System.out.print("Your answer: ");
            Scanner askingForResult = new Scanner(System.in);
            String answer = askingForResult.nextLine();
            if (answer.equals(gameValues[correctAnswers * 2 + 2])) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + gameValues[correctAnswers * 2 + 2] + "'.\nLet's try again, " + Cli.getUserName() + '!');
                break;
            }
            if (correctAnswers > 2) {
                System.out.println("Congratulations, " + Cli.getUserName() + '!');
            }
        }
    }
}
