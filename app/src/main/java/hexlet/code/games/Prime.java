package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int COUNT_LEVELS = 3;


    public static void startGame() {

        String[][] levels = new String[COUNT_LEVELS][2];
        for (int level = 0; level < levels.length; level++) {
            for (int i = 0; i < levels[level].length; i++) {

                int question = Utils.randomIntValue();
                String rightAnswer = Prime.isPrimeNumber(question) ? "yes" : "no";

                levels[level][0] = Integer.toString(question);
                levels[level][1] = rightAnswer;
            }
        }

        Engine.startLevels(GAME_RULE, levels);
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
