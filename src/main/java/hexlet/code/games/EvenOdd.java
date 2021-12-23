package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;
import java.util.Random;

public class EvenOdd {
    public static void evenOddGame() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int correctAnswers = 0;
        while (correctAnswers < 3) {
            Scanner askingForYesOrNo = new Scanner(System.in);
            Random randomNumber = new Random();
            Integer randomNum = randomNumber.nextInt();
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String answer = askingForYesOrNo.nextLine();
            if (randomNum % 2 == 0 && answer.equals("yes") || randomNum % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else if (answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, "
                        + Cli.getUserName() + '!');
                correctAnswers = 0;
            } else {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, "
                        + Cli.getUserName() + '!');
                correctAnswers = 0;
            }
            if (correctAnswers > 2) {
                System.out.println("Congratulations, " + Cli.getUserName() + '!');
            }
        }
    }
}
