package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    int[] progression;
    int  positionOfWishingElement;
    int rightAnswer;

    public Progression() {
        changeQuestion();
    }

    public String getGameRules() {
        return "What number is missing in the progression?";
    }
    public String getQuestion() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == this.positionOfWishingElement) {
                result.append(".. ");
                continue;
            }
            result.append(progression[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }

    public String getRightAnswer() {
        return Integer.toString(this.rightAnswer);
    }

    public boolean isRightAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(Integer.toString(this.rightAnswer));
    }

    public void changeQuestion() {
        final int leftBorder = 5;
        final int rightBorder = 10;
        progression = new int[Engine.randomIntValue(leftBorder, rightBorder)];
        int start = Engine.randomIntValue();
        int sizeProgression = Engine.randomIntValue(leftBorder, rightBorder);
        progression[0] = start;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + sizeProgression;
        }
        positionOfWishingElement = Engine.randomIntValue(0, progression.length);
        this.rightAnswer = progression[positionOfWishingElement];
    }
}
