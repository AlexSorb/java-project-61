package hexlet.code;

import java.util.Scanner;


public class Engine {

    private static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name ? ");
        String userName = Engine.getUserInput();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void gameStart(String gameRule, String[][] levels) {
        String name = Engine.greeting();
        Engine.printGameRules(gameRule);
        final int numQuestion = 0;
        final int numAnswer = 1;

        for (int i = 0; i < levels.length; i++) {
            System.out.println("Question: " + levels[i][numQuestion]);
            System.out.print("Your answer: ");
            String userAnswer = Engine.getUserInput();
            if (!isRight(userAnswer, levels[i][numAnswer])) {
                wrongAnswer(userAnswer, levels[i][numAnswer], name);
                return;
            }
            System.out.println("Correct!");
        }
        winGame(name);
    }
    private static String getUserInput() {
        String userInput = "";
        Scanner inputStr = new Scanner(System.in);
        userInput = inputStr.next().trim();
        return userInput;
    }
    private static void winGame(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
    private static void wrongAnswer(String userAnswer, String rightAnswer, String userName) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                + rightAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }


    public static int randomIntValue(int leftBorder, int rightBorder) {
        return (int) (Math.random() * (rightBorder - leftBorder)) + leftBorder;
    }
    public static int randomIntValue() {
        final int left = 1;
        final int right = 26;
        return randomIntValue(left, right);
    }
    private static void printGameRules(String rule) {
        System.out.println(rule);
    }
    private static boolean isRight(String userAnswer, String rightAnswer) {
        return userAnswer.trim().equalsIgnoreCase(rightAnswer);
    }
}
