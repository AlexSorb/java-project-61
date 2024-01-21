package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private int oneNumber;
    private int twoNumber;
    private int rightAnswer;

    public GCD() {
        this.oneNumber = 0;
        this.twoNumber = 0;
        this.rightAnswer = 0;
        changeQuestion();
    }

    /**
     * Method returns the game rule for the GCD game.
     * @return game rule.
     */
    public String getGameRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    /**
     * The method returns a question for the user.
     * @return question for user.
     */
    public String getQuestion() {
        return this.oneNumber + " " + this.twoNumber;
    }

    /**
     * The method returns the correct answer.
     * @return right answer
     */
    public String getRightAnswer() {
        return Integer.toString(this.rightAnswer);
    }

    /**
     * The method returns true if the correct answer is given.
     * @param userAnswer
     * @return true if the answer is correct
     */
    public boolean isRightAnswer(String userAnswer) {
        return Integer.parseInt(userAnswer)  == this.rightAnswer;
    }

    /**
     * The method sets new parameters for the game.
     */
    public void changeQuestion() {
        final int leftBorder = 2;
        final int rightBorder = 100;
        this.oneNumber = Engine.randomIntValue(leftBorder, rightBorder);
        this.twoNumber = Engine.randomIntValue(leftBorder, rightBorder);
        this.rightAnswer = getGCD(this.oneNumber, this.twoNumber);
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
