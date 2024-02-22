package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final String[] GAME_NAME = {"Exit", "Greet", "Even", "Calculator", "GCD", "Progression", "Prime"};
    public static void main(String[] args) {

        App.printMenu();
        System.out.print("You choice: ");
        int choice = -1;
        Scanner choiceStream = new Scanner(System.in);
        if (choiceStream.hasNextInt()) {
            choice = choiceStream.nextInt();
        }
        if (choice < 0 || choice >= GAME_NAME.length) {
            System.out.println("Incorrect input, try again!");
            return;
        }

        switch (GAME_NAME[choice]) {
            case "Greet":
                Cli.greeting();
                break;
            case "Exit":
                System.out.println("Goodbye!");
                break;
            case "Even":
                Even.startGame();
                break;
            case "Calculator":
                Calc.startGame();
                break;
            case "GCD":
                GCD.startGame();
                break;
            case "Progression":
                Progression.startGame();
                break;
            case "Prime":
                Prime.startGame();
                break;
            default:
                System.out.println("Incorrect input, try again!");
                break;
        }
    }

    public static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 1; i < GAME_NAME.length; i++) {
            System.out.println(i + " - " + GAME_NAME[i]);
        }
        System.out.println(0 + " - " + GAME_NAME[0]);
    }

}
