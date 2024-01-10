package hexlet.code.games;

import hexlet.code.Engine;

public class Progression implements Game{
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
        progression = new int[Engine.randomIntValue(5, 10)];
        int start = Engine.randomIntValue();
        int razmer = Engine.randomIntValue(4,7);
        progression[0] = start;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i-1] + razmer;
        }
        positionOfWishingElement = Engine.randomIntValue(0, progression.length);
        this.rightAnswer = progression[positionOfWishingElement];
    }
}
