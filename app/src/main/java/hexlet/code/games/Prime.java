package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static String getGameRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] createLevels(int numberOfLevels) {
        final int size = 2;
        final int numQuestion = 0;
        final int numAnswer = 1;
        String[][] levels = new String[numberOfLevels][size];
        for (int i = 0; i < levels.length; i++) {
            int number = Engine.randomIntValue();
            levels[i][numQuestion] = Prime.getQuestion(number);
            levels[i][numAnswer] = Prime.getRightAnswer(number);
        }
        return levels;
    }

    private static String getQuestion(int number) {
        return Integer.toString(number);
    }

    private static String getRightAnswer(int number) {
        return isPrimeNumber(number) ? "yes" : "no";
    }
    private static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
