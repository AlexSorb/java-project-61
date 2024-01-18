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

    public String getGameRules() {
        return "What is the result of the expression?";
    }
    public String getQuestion() {
        return leftArg + " " + nameOfOperation + " " + rightArg;
    }
    public String getRightAnswer() {
        return Integer.toString(rightAnswer);
    }
    public boolean isRightAnswer(String userAnswer) {
        return Integer.parseInt(userAnswer)  == rightAnswer;
    }
    public void changeQuestion() {
        this.leftArg = Engine.randomIntValue(1, 11);
        this.rightArg = Engine.randomIntValue(1, 11);
        int numberOfOperation = Engine.randomIntValue(1, 4);
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
