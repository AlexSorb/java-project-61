package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String GAME_RULE = "What number is missing in the progression?";
    private static final int LEFT_BORDER_OF_SIZE_PROGRESSION = 5;
    private static final int RIGHT_BORDER_OF_SIZE_PROGRESSION = 10;
    private static final int LEFT_BORDER_OF_STEP_PROGRESSION = 5;
    private static final int RIGHT_BORDER_OF_STEP_PROGRESSION = 10;


    public static void start(int countLevels) {
        String userName = Engine.greeting();
        Engine.printGameRules(GAME_RULE);
        for (int i = 0; i < countLevels; i++) {
            int[] progression = Progression.generateProgression();
            int positionOfWishingElement = Engine.randomIntValue(0, progression.length);


            String question = getQuestion(progression, positionOfWishingElement);
            int rightAnswer = progression[positionOfWishingElement];

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

    private static int[] generateProgression() {
        int sizeProgression = Engine.randomIntValue(LEFT_BORDER_OF_SIZE_PROGRESSION, RIGHT_BORDER_OF_SIZE_PROGRESSION);
        int stepOfProgression = Engine.randomIntValue(LEFT_BORDER_OF_STEP_PROGRESSION,
                RIGHT_BORDER_OF_STEP_PROGRESSION);
        int[] progression = new int[sizeProgression];

        progression[0] = Engine.randomIntValue();
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + stepOfProgression;
        }
        return progression;
    }
}
