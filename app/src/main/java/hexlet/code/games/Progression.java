package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static String getGameRules() {
        return "What number is missing in the progression?";
    }

    public static String[][] createLevels(int numberOfLevels) {
        final int size = 2;
        final int leftBorder = 5;
        final int rightBorder = 10;
        final int start = 0;
        final int numQuestion = 0;
        final int numAnswer = 1;

        String[][] levels = new String[numberOfLevels][size];
        for (int i = 0; i < levels.length; i++) {
            int startProgression = Engine.randomIntValue();
            int sizeProgression = Engine.randomIntValue(leftBorder, rightBorder);
            int stepProgression = Engine.randomIntValue(leftBorder, rightBorder);

            int[] progression = Progression.generateProgression(startProgression, sizeProgression, stepProgression);
            int positionOfWishingElement = Engine.randomIntValue(start, progression.length);
            levels[i][numQuestion] = Progression.getQuestion(progression, positionOfWishingElement);
            levels[i][numAnswer] = Progression.getRightAnswer(progression, positionOfWishingElement);

        }
        return levels;
    }

    private static String getQuestion(int[] progression, int positionOfWishingElement) {
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
    private static int[] generateProgression(int start, int sizeProgression, int step) {
        int[] progression = new int[sizeProgression];
        if (progression.length <= 0) {
            return null;
        }
        progression[0] = start;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }


    private static String getRightAnswer(int[] progression, int positionOfWishingElement) {
        if (positionOfWishingElement >= progression.length || positionOfWishingElement < 0) {
            return null;
        }
        return Integer.toString(progression[positionOfWishingElement]);
    }
}
