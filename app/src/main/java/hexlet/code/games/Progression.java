package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String GAME_RULE = "What number is missing in the progression?";
    private static final int LEFT_BORDER_OF_SIZE_PROGRESSION = 5;
    private static final int RIGHT_BORDER_OF_SIZE_PROGRESSION = 10;
    private static final int LEFT_BORDER_OF_STEP_PROGRESSION = 5;
    private static final int RIGHT_BORDER_OF_STEP_PROGRESSION = 10;

    public static void startGame() {

        String[][] levels = new String[Engine.COUNT_LEVELS][2];
        for (int level = 0; level < levels.length; level++) {
            int sizeProgression = Utils.randomIntValue(LEFT_BORDER_OF_SIZE_PROGRESSION,
                    RIGHT_BORDER_OF_SIZE_PROGRESSION);
            int stepOfProgression = Utils.randomIntValue(LEFT_BORDER_OF_STEP_PROGRESSION,
                    RIGHT_BORDER_OF_STEP_PROGRESSION);
            int start = Utils.randomIntValue();
            int[] progression = Progression.generateProgression(start, sizeProgression, stepOfProgression);
            int positionOfWishingElement = Utils.randomIntValue(0, progression.length);


            String question = getQuestion(progression, positionOfWishingElement);
            int rightAnswer = progression[positionOfWishingElement];
            levels[level][0] = question;
            levels[level][1] = Integer.toString(rightAnswer);
        }

        Engine.startLevels(GAME_RULE, levels);
    }
    private static String getQuestion(int[] progression, int positionOfWishingElement) {
        if (positionOfWishingElement < 0 || positionOfWishingElement > progression.length) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == positionOfWishingElement) {
                result.append(".. ");
                continue;
            }
            result.append(progression[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }

    private static int[] generateProgression(int start, int sizeProgression, int stepOfProgression) {
        int[] progression = new int[sizeProgression];

        progression[0] = start;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + stepOfProgression;
        }
        return progression;
    }
}
