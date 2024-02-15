package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    final static int COUNT_LEVELS = 3;
    final static int START_CLI = 1;
    final static int START_EXIT = 0;
    final static int START_EVEN = 2;
    final static int START_CALC = 3;
    final static int START_GCD = 4;
    final static int START_PROGRESSION = 5;
    final static int START_PRIME = 6;
    final static String[] GAME_NAME = {"Exit", "Greet", "Even", "Calculator", "GCD", "Progression","Prime"};
    public static void main(String[] args) {

        App.printMenu();
        System.out.print("You choice: ");
        Scanner choiceStream = new Scanner(System.in);
        int choice = choiceStream.nextInt();

        switch (choice) {
            case START_CLI:
                Cli.greeting();
                break;
            case START_EXIT:
                System.out.println("Goodbye!");
                break;
            case START_EVEN:
                Even.start(COUNT_LEVELS);
                break;
            case START_CALC:
                Calc.start(COUNT_LEVELS);
                break;
            case START_GCD:
                GCD.start(COUNT_LEVELS);
                break;
            case START_PROGRESSION:
                Progression.start(COUNT_LEVELS);
                break;
            case START_PRIME:
                Prime.start(COUNT_LEVELS);
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
