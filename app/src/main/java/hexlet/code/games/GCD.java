package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static String getGameRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    private static String getQuestion(int leftArg, int rightArg) {
        return leftArg + " " + rightArg;
    }

    public static String[][] createLevels(int numberOfLevels) {
        final int numQuestion = 0;
        final int numAnswer = 1;
        final int size = 2;
        String[][] levels = new String[numberOfLevels][size];

        for (int i = 0; i < levels.length; i++) {
            int left = Engine.randomIntValue();
            int right = Engine.randomIntValue();
            levels[i][numQuestion] = GCD.getQuestion(left, right);
            levels[i][numAnswer] = GCD.getRightAnswer(left, right);
        }
        return levels;
    }

    private static String getRightAnswer(int leftArg, int rightArg) {
        return Integer.toString(getGCD(leftArg, rightArg));
    }

    private static int getGCD(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            return -1;
        }
        int first = firstNumber;
        int second = secondNumber;
        while (first != 0 && second != 0) {
            if (first > second) {
                first = first % second;
            } else {
                second = second % first;
            }
        }
        return first + second;
    }
}
