package hexlet.code.games;

import hexlet.code.Engine;
public class Calc  {
    public static String getGameRules() {
        return "What is the result of the expression?";
    }

    private static String getQuestion(int num1, int num2, String operation)  {
        return num1 + " " + operation + " " + num2;
    }

    public static String[][] createLevels(int numberOfLevels) {
        final int numQuestion = 0;
        final int numAnswer = 1;
        final int size = 2;
        final int leftBorder = 1;
        final int rightBorder = 4;

        String[][] levels = new String[numberOfLevels][size];
        for (int i = 0; i < levels.length; i++) {
            int left = Engine.randomIntValue();
            int right = Engine.randomIntValue();
            int numbOperation = Engine.randomIntValue(leftBorder, rightBorder);
            levels[i][numQuestion] = Calc.getQuestion(left, right, Calc.getSymbolOperation(numbOperation));
            levels[i][numAnswer] = Calc.getRightAnswer(left, right, numbOperation);
        }
        return levels;
    }
    private static String getRightAnswer(int leftArg, int rightArg, int numberOperation) {
        final int startPlus = 1;
        final int startMinus = 2;
        final int startMultiplication = 3;
        int result;

        switch (numberOperation) {
            case startPlus:
                result = plus(leftArg, rightArg);
                break;
            case startMinus:
                result = minus(leftArg, rightArg);
                break;
            case startMultiplication:
                result = multiplication(leftArg, rightArg);
                break;
            default:
                result = plus(leftArg, rightArg);
                break;
        }
        return Integer.toString(result);
    }
    private static String getSymbolOperation(int numberOperation) {
        final int startPlus = 1;
        final int startMinus = 2;
        final int startMultiplication = 3;
        String result = "";

        switch (numberOperation) {

            case startPlus:
                result = "+";
                break;
            case startMinus:
                result = "-";
                break;
            case startMultiplication:
                result = "*";
                break;
            default:
                result = "+";
                break;
        }

        return result;
    }

    private static int plus(int num1, int num2) {
        return num1 + num2;
    }
    private static int  minus(int num1, int num2) {
        return num1 - num2;
    }
    private static int  multiplication(int num1, int num2) {
        return num1 * num2;
    }
}
