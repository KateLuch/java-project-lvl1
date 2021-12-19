package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        Scanner askingForGameNum = new Scanner(System.in);
        System.out.print("Your choice: ");
        Integer gameNum = askingForGameNum.nextInt();
        switch (gameNum) {
            case 0:
                break;
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.greetByName();
                break;
            case 2:
                System.out.println("Welcome to the Brain Games!");
                Cli.greetByName();
                EvenOdd.EvenOddGame();
                break;
            default:
                break;
        }
    }
}
