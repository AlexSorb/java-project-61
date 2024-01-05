package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        App.printMenu();

        System.out.print("You choice: ");
        Scanner choiceStream = new Scanner(System.in);
        int choice = choiceStream.nextInt();
        Engine engine = new Engine();

        switch (choice) {

            case 1:
                Cli.greeting();
                break;

            case 0:
                System.out.println("Goodbye!");
                break;
            case 2:
                engine.start("Even");
                break;
            case 3:
                engine.start("Calc");
                break;
            case 4:
                engine.start("GCD");
                break;
            default:
                System.out.println("Error1");
                break;
        }
    }

    public static void printMenu() {
        // Меню выбора игры
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
    }

}
