package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class EvenOdd {
    public static void evenOddGame() {
        final int arraySize = 7;
        String[] evenOddLogic = new String[arraySize];
        evenOddLogic[0] = "Answer 'yes' if number even otherwise answer 'no'.";
        for (int i = 1; i < evenOddLogic.length; i += 2) {
            Random randomNumber = new Random();
            int randomNum = randomNumber.nextInt();
            evenOddLogic[i] = "Question: " + randomNum;
            if (randomNum % 2 == 0) {
                evenOddLogic[i + 1] = "yes";
            } else {
                evenOddLogic[i + 1] = "no";
            }
        }
        Engine.gameLogic(evenOddLogic);
    }
}
