package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start(int countLevels) {
        String userName = Engine.greeting();
        Engine.printGameRules(GAME_RULE);

        for (int i = 0; i < countLevels; i++) {
            int question = Engine.randomIntValue();
            String rightAnswer = Even.isEven(question) ? "yes" : "no";

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

    private static boolean isEven(int num) {
        if (num < 0) {
            return false;
        }
        return num % 2 == 0;
    }

}
