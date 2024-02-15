package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start(int countLevels) {
        String userName = Engine.greeting();
        Engine.printGameRules(GAME_RULE);

        for (int i = 0; i < countLevels; i++) {
            int question = Engine.randomIntValue();
            String rightAnswer = Prime.isPrimeNumber(question) ? "yes" : "no";

            Engine.askQuestion(Integer.toString(question));
            String userAnswer = Engine.getAnswer();
            if (!Engine.isRightAnswer(userAnswer, rightAnswer)) {
                Engine.wrongAnswer(userAnswer, rightAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        Engine.winGame(userName);
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
