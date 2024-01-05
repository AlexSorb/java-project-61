package hexlet.code.games;

import hexlet.code.Engine;

public class Even implements Game {

    private int currentNumber;
    private String rightAnswer;


    public Even() {
        this.currentNumber = Engine.randomIntValue();
        this.rightAnswer = isEven(currentNumber) ? "yes" : "no";
    }

    public String getGameRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public String getQuestion() {
        return Integer.toString(currentNumber);
    }
    public String getRightAnswer() {
        return rightAnswer;
    }

    public boolean isRightAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(rightAnswer);
    }

    public void changeQuestion() {
        currentNumber = Engine.randomIntValue();
        rightAnswer = isEven(currentNumber) ? "yes" : "no";
    }

    private boolean isEven(int num) {
        if (num < 0) {
            return false;
        }
        return num % 2 == 0;
    }

}
