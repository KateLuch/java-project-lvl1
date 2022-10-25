package hexlet.gradle;

import hexlet.gradle.games.EvenOdd;
import hexlet.gradle.games.Calc;
import hexlet.gradle.games.Gcd;
import hexlet.gradle.games.Prime;
import hexlet.gradle.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD"
                + "\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner askingForGameNum = new Scanner(System.in);
        System.out.print("Your choice: ");
        String gameNum = askingForGameNum.nextLine();
        switch (gameNum) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.greetByName();
                break;
            case "2":
                EvenOdd.evenOddGame();
                break;
            case "3":
                Calc.calcGame();
                break;
            case "4":
                Gcd.gcdGame();
                break;
            case "5":
                Progression.progressionGame();
                break;
            case "6":
                Prime.primeGame();
                break;
            default:
                break;
        }
    }
}
