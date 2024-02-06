package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static String getGameRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static String[][] createLevels(int numberOfLevels) {
        final int size = 2;
        final int numQuestion = 0;
        final int numAnswer = 1;
        String[][] levels = new String[numberOfLevels][size];

        for (int i = 0; i < levels.length; i++) {
            int number = Engine.randomIntValue();
            levels[i][numQuestion] = Even.getQuestion(number);
            levels[i][numAnswer] = Even.getRightAnswer(number);
        }
        return levels;
    }

    private static String getQuestion(int number) {
        return Integer.toString(number);
    }

    private static String getRightAnswer(int number) {
        return Even.isEven(number) ? "yes" : "no";
    }

    private static boolean isEven(int num) {
        if (num < 0) {
            return false;
        }
        return num % 2 == 0;
    }

}
