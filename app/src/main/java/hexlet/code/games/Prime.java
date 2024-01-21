package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private int number;
    private String rightAnswer;
    public Prime() {
        changeQuestion();
    }

    /**
     * Method returns the game rule for the Prime game.
     * @return game rule.
     */
    public String getGameRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    /**
     * The method returns a question for the user.
     * @return question for user.
     */
    public String getQuestion() {
        return Integer.toString(this.number);
    }

    /**
     * The method returns the correct answer.
     * @return right answer
     */
    public String getRightAnswer() {
        return this.rightAnswer;
    }

    /**
     * The method returns true if the correct answer is given.
     * @param userAnswer
     * @return true if the answer is correct
     */
    public boolean isRightAnswer(String userAnswer) {
        return this.rightAnswer.equalsIgnoreCase(userAnswer);
    }

    /**
     * The method sets new parameters for the game.
     */
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
