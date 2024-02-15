package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";

    public static void start(int countLevels) {
        String userName = Engine.greeting();
        Engine.printGameRules(GAME_RULE);

        for (int i = 0; i < countLevels; i++) {
            int leftArg = Engine.randomIntValue();
            int rightArg = Engine.randomIntValue();
            String question = leftArg + " " + rightArg;
            String rightAnswer = Integer.toString(GCD.getGCD(leftArg, rightArg));

            Engine.askQuestion(question);
            String userAnswer = Engine.getAnswer();
            if (!Engine.isRightAnswer(userAnswer, rightAnswer)) {
                Engine.wrongAnswer(userAnswer, rightAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        Engine.winGame(userName);
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
