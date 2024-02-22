package hexlet.code;

import java.util.Scanner;


public class Engine {
    private static final int NUMBER_OF_QUESTION = 0;
    private static final int NUMBER_OF_ANSWER = 1;

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

    public static void startLevels(String gameRule, String[][]date) {
        String userName = Engine.greeting();
        System.out.println(gameRule);

        for (String[] level : date) {
            String question = level[NUMBER_OF_QUESTION];
            String rightAnswer = level[NUMBER_OF_ANSWER];

            System.out.println("Question: " + question);

            System.out.print("Your answer: ");
            String userAnswer = Engine.getUserInput();
            if (!userAnswer.equalsIgnoreCase(rightAnswer)) {
                Engine.wrongAnswer(userAnswer, rightAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
