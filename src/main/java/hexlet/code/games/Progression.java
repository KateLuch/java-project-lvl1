package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void progressionGame() {
        final int maxBoundValue = 6;
        final int sequenceLengthExtension = 5;
        final int arraySize = 7;
        String[] progressionLogic = new String[arraySize];
        progressionLogic[0] = "What number is missing in the progression?";
        for (int i = 1; i < progressionLogic.length; i += 2) {
            Random randomNum1 = new Random();
            int difference = randomNum1.nextInt(maxBoundValue); //шаг for range from 0 to 5
            int sequenceLength = randomNum1.nextInt(maxBoundValue) + sequenceLengthExtension;
            //for range from 5 up to 10
            int firstNum = randomNum1.nextInt(maxBoundValue);
            int missingNumIndex = randomNum1.nextInt(sequenceLength);
            progressionLogic[i] = "Question: ";
            progressionLogic[i + 1] = String.valueOf(firstNum + missingNumIndex * difference);
            for (int j = 0; j < sequenceLength; j++) {
                if (j == missingNumIndex) {
                    progressionLogic[i] = progressionLogic[i] + ".. ";
                } else {
                    progressionLogic[i] = progressionLogic[i] + (firstNum + j * difference) + " ";
                }
            }
        }
        Engine.gameLogic(progressionLogic);
    }
}



