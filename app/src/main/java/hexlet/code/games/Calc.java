package hexlet.code.games;

import hexlet.code.Engine;
public class Calc  {
    private static final String GAME_RULE = "What is the result of the expression?";
    private static final String[] SYMBOLS_OPERATION = {"+", "-", "*"};
    private static final int MAX_NUMBER = 10;
    private static final int MIN_NUMBER = 1;

    public static void start(int countLevels) {
        String userName = Engine.greeting();
        Engine.printGameRules(GAME_RULE);
        for (int i = 0; i < countLevels; i++) {
            int leftArgument = Engine.randomIntValue(MIN_NUMBER, MAX_NUMBER);
            int rightArgument = Engine.randomIntValue(MIN_NUMBER, MAX_NUMBER);
            int numberOfOperation = Engine.randomIntValue(0, SYMBOLS_OPERATION.length);

            String question = leftArgument + " " +  SYMBOLS_OPERATION[numberOfOperation] + " " + rightArgument;
            int rightAnswer = Calc.getRightAnswer(leftArgument, rightArgument, numberOfOperation);

            Engine.askQuestion(question);
            String userAnswer = Engine.getAnswer();
            if (!Engine.isRightAnswer(userAnswer, Integer.toString(rightAnswer))) {
                Engine.wrongAnswer(userAnswer, Integer.toString(rightAnswer), userName);
                return;
            }
            System.out.println("Correct!");
        }
        Engine.winGame(userName);
    }


    private static int getRightAnswer(int leftArg, int rightArg, int numberOfOperation) {
        int result;
        switch (SYMBOLS_OPERATION[numberOfOperation]) {
            case "+":
                result = plus(leftArg, rightArg);
                break;
            case "-":
                result = minus(leftArg, rightArg);
                break;
            case "*":
                result = multiplication(leftArg, rightArg);
                break;
            default:
                System.out.println("Incorrect input!");
                result = -1;
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
