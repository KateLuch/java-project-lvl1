package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;
import java.util.Random;

public class Gcd {
    public static void gcdGame() {
        final int requiredCorrectAnswers = 3;
        final int maxBoundValue = 100;
        System.out.println("Find the greatest common divisor of given numbers.");
        int correctAnswers = 0;
        while (correctAnswers < requiredCorrectAnswers) {
            Scanner askingForResult = new Scanner(System.in);
            Random randomNum1 = new Random();
            Integer num1 = randomNum1.nextInt(maxBoundValue);
            Random randomNum2 = new Random();
            Integer num2 = randomNum2.nextInt(maxBoundValue);
            int result = gcdCalculator(num1, num2);
            System.out.println("Question: " + num1 + ' ' + num2);
            System.out.print("Your answer: ");
            String answer = askingForResult.nextLine();
            if (Integer.parseInt(answer) == result) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result
                        + "'\nLet's try again, " + Cli.getUserName() + '!');
                break;
            }
            if (correctAnswers > 2) {
                System.out.println("Congratulations, " + Cli.getUserName() + '!');
            }
        }
    }

    private static int gcdCalculator(int num1, int num2) {
        int resultingGcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                resultingGcd = i;
            }
        }
        return resultingGcd;
    }
}

