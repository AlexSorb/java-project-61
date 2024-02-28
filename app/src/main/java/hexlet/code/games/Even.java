package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    public static void startGame() {
        String[][] levels = new String[Engine.COUNT_LEVELS][2];
        for (int level = 0; level < levels.length; level++) {
            int question = Utils.randomIntValue();

            String rightAnswer = Even.isEven(question) ? "yes" : "no";
            levels[level][0] = Integer.toString(question);
            levels[level][1] = rightAnswer;
        }
        Engine.startLevels(GAME_RULE, levels);
    }

    private static boolean isEven(int num) {
        if (num < 0) {
            return false;
        }
        return num % 2 == 0;
    }

}
