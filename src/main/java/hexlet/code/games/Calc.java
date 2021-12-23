package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void calcGame() {
        System.out.println("What is the result of the expression?");
        int correctAnswers = 0;
        while (correctAnswers < 3) {
            Scanner askingForResult = new Scanner(System.in);
            Random randomValue1 = new Random();
            Integer randomVal1 = randomValue1.nextInt(100);
            Random randomValue2 = new Random();
            Integer randomVal2 = randomValue2.nextInt(100);
            Random mathOperator = new Random();
            int result = 0;

            switch (mathOperator.nextInt(3)) {
                case 0:
                    System.out.println("Question: " + randomVal1 + " + " + randomVal2);
                    result = randomVal1 + randomVal2; // add
                    break;
                case 1:
                    System.out.println("Question: " + randomVal1 + " - " + randomVal2);
                    result = randomVal1 - randomVal2; //subtract
                    break;
                case 2:
                    System.out.println("Question: " + randomVal1 + " * " + randomVal2);
                    result = randomVal1 * randomVal2; //multiply
                    break;
                default:
                    break;
            }
            System.out.print("Your answer: ");
            String answer = askingForResult.nextLine();
            if (Integer.parseInt(answer) == result) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result
                        + "'\nLet's try again, " + Cli.getUserName() + '!');
                correctAnswers = 0;
            }
            if (correctAnswers > 2) {
                System.out.println("Congratulations, " + Cli.getUserName() + '!');
            }
        }
    }
}
