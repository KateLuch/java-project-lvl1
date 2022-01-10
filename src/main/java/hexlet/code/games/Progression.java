package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;
import java.util.Random;

public class Progression {
    public static void progressionGame() {
        final int requiredCorrectAnswers = 3;
        final int maxBoundValue = 6;
        final int sequenceLengthExtension = 5;
        int missingNum = 0;
        System.out.println("What number is missing in the progression?");
        int correctAnswers = 0;
        while (correctAnswers < requiredCorrectAnswers) {
            Random randomNum1 = new Random();
            int difference = randomNum1.nextInt(maxBoundValue);
            int sequenceLength = randomNum1.nextInt(maxBoundValue) + sequenceLengthExtension; //for length - up to 10
            int firstNum = randomNum1.nextInt(maxBoundValue);
            int missingNumIndex = randomNum1.nextInt(sequenceLength + 1); //
            System.out.print("Question: ");
            missingNum = firstNum + missingNumIndex * difference;
            for (int i = 0; i <= sequenceLength; i++) {
                if (i == missingNumIndex) {
                    System.out.print(".. ");
                } else {
                    System.out.print(firstNum + i * difference + " ");
                }
            }
            System.out.println("");
            System.out.print("Your answer: ");
            Scanner askingForResult = new Scanner(System.in);
            String answer = askingForResult.nextLine();
            if (Integer.parseInt(answer) == missingNum) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + missingNum
                        + "'\nLet's try again, " + Cli.getUserName() + '!');
                break;
            }
            if (correctAnswers > 2) {
                System.out.println("Congratulations, " + Cli.getUserName() + '!');
            }
        }
    }

//    public static void main(String[] args) {
//        progressionGame();
//    }
}
