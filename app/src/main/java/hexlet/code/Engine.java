package hexlet.code;

import java.util.Scanner;


public class Engine {

    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name ? ");
        String userName = Engine.getUserInput();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    private static String getUserInput() {
        Scanner inputStr = new Scanner(System.in);
        return inputStr.next().trim();
    }
    public static void winGame(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void wrongAnswer(String userAnswer, String rightAnswer, String userName) {
        String wrongMassage = "'"
                + userAnswer
                + "' is wrong answer ;(. Correct answer was '"
                + rightAnswer
                + "'.";

        String restartMassage = "Let's try again, "
                + userName
                + "!";

        System.out.println(wrongMassage);
        System.out.println(restartMassage);
    }


    public static int randomIntValue(int leftBorder, int rightBorder) {
        return (int) (Math.random() * (rightBorder - leftBorder)) + leftBorder;
    }
    public static int randomIntValue() {
        final int left = 1;
        final int right = 26;
        return randomIntValue(left, right);
    }
    public static void printGameRules(String rule) {
        System.out.println(rule);
    }
    public static boolean isRightAnswer(String userAnswer, String rightAnswer) {
        return userAnswer.trim().equalsIgnoreCase(rightAnswer);
    }
    public static void askQuestion(String question) {
        System.out.println("Question: " + question);
    }

    public static String getAnswer() {
        System.out.print("Your answer: ");
        return Engine.getUserInput();
    }
}
