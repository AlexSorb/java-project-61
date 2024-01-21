package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        App.printMenu();
        System.out.print("You choice: ");
        Scanner choiceStream = new Scanner(System.in);
        int choice = choiceStream.nextInt();
        Engine engine = new Engine();


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
                engine.start("Even");
                break;
            case startCalc:
                engine.start("Calc");
                break;
            case startGCD:
                engine.start("GCD");
                break;
            case startProgression:
                engine.start("Progression");
                break;
            case startPrime:
                engine.start("Prime");
                break;
            default:
                System.out.println("Error1");
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
