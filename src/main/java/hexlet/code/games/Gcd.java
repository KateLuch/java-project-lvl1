package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    public static void gcdGame() {

        final int maxBoundValue = 100;
        final int arraySize = 7;
        String[] gcdLogic = new String[arraySize];
        gcdLogic[0] = "Find the greatest common divisor of given numbers.";
        for (int i = 1; i < gcdLogic.length; i += 2) {
            Random randomNum1 = new Random();
            int num1 = randomNum1.nextInt(maxBoundValue);
            Random randomNum2 = new Random();
            int num2 = randomNum2.nextInt(maxBoundValue);
            gcdLogic[i] = "Question: " + num1 + ' ' + num2;
            gcdLogic[i + 1] = String.valueOf(gcdCalculator(num1, num2));
        }
        Engine.gameLogic(gcdLogic);
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

