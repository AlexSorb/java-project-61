package hexlet.code.games;

import hexlet.code.Engine;
public class Calc  {
    private static final String GAME_RULE = "What is the result of the expression?";
    private static final String[] SYMBOLS_OPERATION = {"+", "-", "*"};
    private static final int MAX_NUMBER = 10;
    private static final int MIN_NUMBER = 1;
    private static final int COUNT_LEVELS = 3;

    public static void startGame() {

        String[][] result = new String[COUNT_LEVELS][2];
        for (int level = 0; level < result.length; level++) {
            for (int i = 0; i < result[level].length; i++) {
                int leftArgument = Utils.randomIntValue(MIN_NUMBER, MAX_NUMBER);
                int rightArgument = Utils.randomIntValue(MIN_NUMBER, MAX_NUMBER);
                int numberOfOperation = Utils.randomIntValue(0, SYMBOLS_OPERATION.length);

                String question = leftArgument + " " + SYMBOLS_OPERATION[numberOfOperation] + " " + rightArgument;
                int rightAnswer = Calc.getRightAnswer(leftArgument, rightArgument, numberOfOperation);
                result[level][0] = question;
                result[level][1] = Integer.toString(rightAnswer);
            }
        }

        Engine.startLevels(GAME_RULE, result);
    }


    private static Integer getRightAnswer(int leftArg, int rightArg, int numberOfOperation) {
        switch (SYMBOLS_OPERATION[numberOfOperation]) {
            case "+":
                return leftArg + rightArg;
            case "-":
                return leftArg - rightArg;
            case "*":
                return leftArg * rightArg;
            default:
                return null;
        }
    }

}
