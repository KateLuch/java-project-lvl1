package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    public static void primeGame() {

        final int maxBoundValue = 100;
        final int arraySize = 7;
        String[] primeLogic = new String[arraySize];
        primeLogic[0] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 1; i < primeLogic.length; i += 2) {
            Random randomNumber = new Random();
            int randomNum = randomNumber.nextInt(maxBoundValue);
            primeLogic[i] = "Question: " + randomNum;
            if (isPrime(randomNum)) {
                primeLogic[i + 1] = "yes";
            } else {
                primeLogic[i + 1] = "no";
            }
        }
        Engine.gameLogic(primeLogic);
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
//        primeGame();
//        isPrime(9);
//        System.out.println(isPrime(9));
//
//    }
}
