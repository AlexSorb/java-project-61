package hexlet.code;

import java.io.IOException;
import java.util.Scanner;
public class Cli {
    public static void greeting() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name ? ");
        String userName = "";
        userName = scanner.next();
        System.out.println("Hello, " + userName);
        scanner.close();
    }
}
