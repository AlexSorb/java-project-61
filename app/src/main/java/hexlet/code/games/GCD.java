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
    public String getGameRules() {
        return "Find the greatest common divisor of given numbers.";
    }
    public String getQuestion() {
        return this.oneNumber + " " + this.twoNumber;
    }
    public String getRightAnswer() {
        return Integer.toString(this.rightAnswer);
    }
    public boolean isRightAnswer(String userAnswer) {
        return Integer.parseInt(userAnswer)  == this.rightAnswer;
    }

    public void changeQuestion() {
        this.oneNumber = Engine.randomIntValue(2, 100);
        this.twoNumber = Engine.randomIntValue(2, 100);
        this.rightAnswer = getGCD(this.oneNumber, this.twoNumber);
    }

    public static int getGCD(int firstNumber, int secondNumber) {
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
