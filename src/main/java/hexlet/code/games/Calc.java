package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static void calcGame() {
        final int maxBoundValue = 100;
        final int switchBoundValue = 3;
        final int arraySize = 7;
        String[] calcLogic = new String[arraySize];
        calcLogic[0] = "What is the result of the expression?";
        for (int i = 1; i < calcLogic.length; i += 2) {
            Random randomValue1 = new Random();
            int randomVal1 = randomValue1.nextInt(maxBoundValue);
            Random randomValue2 = new Random();
            int randomVal2 = randomValue2.nextInt(maxBoundValue);
            Random mathOperator = new Random();
            String mathOperatorOption = "";
            switch (mathOperator.nextInt(switchBoundValue)) {
                case 0:
                    mathOperatorOption = "+";
                    calcLogic[i + 1] = String.valueOf(randomVal1 + randomVal2);
                    break;
                case 1:
                    mathOperatorOption = "-";
                    calcLogic[i + 1] = String.valueOf(randomVal1 - randomVal2);
                    break;
                case 2:
                    mathOperatorOption = "*";
                    calcLogic[i + 1] = String.valueOf(randomVal1 * randomVal2);
                    break;
                default:
                    break;
            }
            calcLogic[i] = "Question: " + randomVal1 + " " + mathOperatorOption + " " + randomVal2;
        }
        Engine.gameLogic(calcLogic);
    }
}
