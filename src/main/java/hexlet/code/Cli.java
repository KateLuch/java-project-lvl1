package hexlet.code;

import java.util.Scanner;

public class Cli {
    static void greetByName() {
        Scanner askingForName = new Scanner(System.in);
        System.out.print("May I have your name? ");
        App.userName = askingForName.nextLine(); // Read user input
        System.out.println("Hello, " + App.userName + '!');
    }
}
