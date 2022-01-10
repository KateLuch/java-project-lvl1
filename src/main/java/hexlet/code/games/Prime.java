package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;
import java.util.Random;

public class Prime {
    public static void primeGame() {
        final int requiredCorrectAnswers = 3;
        final int maxBoundValue = 100;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int correctAnswers = 0;
        while (correctAnswers < requiredCorrectAnswers) {
            Scanner askingForYesOrNo = new Scanner(System.in);
            Random randomNumber = new Random();
            int randomNum = randomNumber.nextInt(maxBoundValue);
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String answer = askingForYesOrNo.nextLine();
            if ((isPrime(randomNum) && answer.equals("yes")) || (!isPrime(randomNum) && answer.equals("no"))) {
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

    private static boolean isPrime(int randomNum) {
        if (randomNum <= 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(randomNum) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (randomNum % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
////        primeGame();
//        isPrime(9);
//        System.out.println(isPrime(9));
//
//    }
}
