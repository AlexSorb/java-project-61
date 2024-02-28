package hexlet.code;

import java.util.Scanner;


public class Engine {
    private static final int NUMBER_OF_QUESTION = 0;
    private static final int NUMBER_OF_ANSWER = 1;
    public static final int COUNT_LEVELS = 3;


    public static void startLevels(String gameRule, String[][]levels) {
        Scanner inputStr = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        String userName = getUserName(inputStr);
        System.out.println(gameRule);

        for (String[] level : levels) {
            String question = level[NUMBER_OF_QUESTION];
            String rightAnswer = level[NUMBER_OF_ANSWER];

            System.out.println("Question: " + question);

            System.out.print("Your answer: ");
            String userAnswer = inputStr.next().trim();
            if (!userAnswer.equalsIgnoreCase(rightAnswer)) {
                Engine.wrongAnswer(userAnswer, rightAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
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
    private static String getUserName(Scanner inputStream) {
        System.out.print("May I have your name ? ");
        String userName = inputStream.next().trim();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

}
