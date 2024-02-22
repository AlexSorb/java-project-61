package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";
    private static final int COUNT_LEVELS = 3;


    public static void startGame() {

        String[][] levels = new String[COUNT_LEVELS][2];
        for (int level = 0; level < levels.length; level++) {
            for (int i = 0; i < levels[level].length; i++) {
                int leftArgument = Utils.randomIntValue();
                int rightArgument = Utils.randomIntValue();

                String question = leftArgument + " " + rightArgument;
                int rightAnswer = GCD.getGCD(leftArgument, rightArgument);
                levels[level][0] = question;
                levels[level][1] = Integer.toString(rightAnswer);
            }
        }

        Engine.startLevels(GAME_RULE, levels);
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
