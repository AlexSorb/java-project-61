package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        App.printMenu();
        System.out.print("You choice: ");
        Scanner choiceStream = new Scanner(System.in);
        int choice = choiceStream.nextInt();


        final int countLevels = 3;

        final int startCli = 1;
        final int startExit = 0;
        final int startEven = 2;
        final int startCalc = 3;
        final int startGCD = 4;
        final int startProgression = 5;
        final int startPrime = 6;

        switch (choice) {
            case startCli:
                Cli.greeting();
                break;
            case startExit:
                System.out.println("Goodbye!");
                break;
            case startEven:
                Engine.gameStart(Even.getGameRules(), Even.createLevels(countLevels));
                break;
            case startCalc:
                Engine.gameStart(Calc.getGameRules(), Calc.createLevels(countLevels));
                break;
            case startGCD:
                Engine.gameStart(GCD.getGameRules(), GCD.createLevels(countLevels));
                break;
            case startProgression:
                Engine.gameStart(Progression.getGameRules(), Progression.createLevels(countLevels));
                break;
            case startPrime:
                Engine.gameStart(Prime.getGameRules(), Prime.createLevels(countLevels));
                break;
            default:
                System.out.println("Incorrect input, try again!");
                break;
        }
    }

    public static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }

}
