package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    int number;
    String rightAnswer;
    public Prime() {
        changeQuestion();
    }

    public String getGameRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String getQuestion() {
        return Integer.toString(this.number);
    }

    public String getRightAnswer() {
        return this.rightAnswer;
    }

    public boolean isRightAnswer(String userAnswer) {
        return this.rightAnswer.equalsIgnoreCase(userAnswer);
    }

    public void changeQuestion() {
        this.number = Engine.randomIntValue();
        this.rightAnswer = isPrimeNumber(this.number) ? "yes" : "no";
    }

    private boolean isPrimeNumber(int num) {
        if (num == 1) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
