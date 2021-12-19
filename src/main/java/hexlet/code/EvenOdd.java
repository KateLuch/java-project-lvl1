package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class EvenOdd {
    static void evenOddGame() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int correctAnswers = 0;
        while (correctAnswers != 3) {
            Scanner askingForYesOrNo = new Scanner(System.in);
            Random randomNumber = new Random();
            Integer randomNum = randomNumber.nextInt(1000);
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String answer = askingForYesOrNo.nextLine();
            if (randomNum % 2 == 0 && answer.equals("yes") || randomNum % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else if (answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, "
                        + Cli.userName + '!');
                correctAnswers = 0;
            } else {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, "
                        + Cli.userName + '!');
                correctAnswers = 0;
            }
            if (correctAnswers == 3) {
                System.out.println("Congratulations, " + Cli.userName + '!');
            }
        }
    }
}
