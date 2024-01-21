package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    private int currentNumber;
    private String rightAnswer;


    public Even() {
        this.currentNumber = Engine.randomIntValue();
        this.rightAnswer = isEven(currentNumber) ? "yes" : "no";
    }

    /**
     * Method returns the game rule for the GCD game.
     * @return game rule.
     */
    public String getGameRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    /**
     * The method returns a question for the user.
     * @return question for user.
     */
    public String getQuestion() {
        return Integer.toString(currentNumber);
    }

    /**
     * The method returns the correct answer.
     * @return right answer
     */
    public String getRightAnswer() {
        return rightAnswer;
    }

    /**
     * The method returns true if the correct answer is given.
     * @param userAnswer
     * @return true if the answer is correct
     */
    public boolean isRightAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(rightAnswer);
    }

    /**
     * The method sets new parameters for the game.
     */
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
