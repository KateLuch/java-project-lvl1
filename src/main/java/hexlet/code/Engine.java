package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenOdd;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    static void startGames() {
        Scanner askingForGameNum = new Scanner(System.in);
        System.out.print("Your choice: ");
        String gameNum = askingForGameNum.nextLine();
        switch (gameNum) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.greetByName();
                break;
            case "2":
                System.out.println("Welcome to the Brain Games!");
                Cli.greetByName();
                EvenOdd.evenOddGame();
                break;
            case "3":
                System.out.println("Welcome to the Brain Games!");
                Cli.greetByName();
                Calc.calcGame();
                break;
            case "4":
                System.out.println("Welcome to the Brain Games!");
                Cli.greetByName();
                Gcd.gcdGame();
                break;
            case "5":
                System.out.println("Welcome to the Brain Games!");
                Cli.greetByName();
                Progression.progressionGame();
                break;
            default:
                break;
        }
    }
}
