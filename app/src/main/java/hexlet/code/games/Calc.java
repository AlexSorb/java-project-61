package hexlet.code.games;

import hexlet.code.Engine;
public class Calc  {
    private int leftArg;
    private int rightArg;
    private int rightAnswer;
    private String nameOfOperation;


    public Calc() {
        this.leftArg = 0;
        this.rightArg = 0;
        changeQuestion();
    }

    /**
     * Method returns the game rule for the Calc game.
     * @return game rule.
     */
    public String getGameRules() {
        return "What is the result of the expression?";
    }

    /**
     * The method returns a question for the user.
     * @return question for user.
     */
    public String getQuestion() {
        return leftArg + " " + nameOfOperation + " " + rightArg;
    }

    /**
     * The method returns the correct answer.
     * @return right answer
     */
    public String getRightAnswer() {
        return Integer.toString(rightAnswer);
    }

    /**
     * The method returns true if the correct answer is given.
     * @param userAnswer
     * @return true if the answer is correct
     */
    public boolean isRightAnswer(String userAnswer) {
        return Integer.parseInt(userAnswer)  == rightAnswer;
    }

    /**
     * The method sets new parameters for the game.
     */
    public void changeQuestion() {
        final int leftBorder = 1;
        final int rightBorder = 11;
        final int leftBorderOfOperation = 1;
        final int rightBorderOfOperation = 4;
        this.leftArg = Engine.randomIntValue(leftBorder, rightBorder);
        this.rightArg = Engine.randomIntValue(leftBorder, rightBorder);
        int numberOfOperation = Engine.randomIntValue(leftBorderOfOperation, rightBorderOfOperation);
        switch (numberOfOperation) {
            case 1:
                plus();
                break;
            case 2:
                minus();
                break;
            case 3:
                multiplication();
                break;
            default:
                plus();
                break;
        }
    }
    private void plus() {
        this.nameOfOperation = "+";
        this.rightAnswer = leftArg + rightArg;
    }
    private void  minus() {
        this.nameOfOperation = "-";
        this.rightAnswer = leftArg - rightArg;
    }
    private void  multiplication() {
        this.nameOfOperation = "*";
        this.rightAnswer = leftArg * rightArg;
    }
}
