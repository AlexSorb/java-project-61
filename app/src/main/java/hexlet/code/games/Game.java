package hexlet.code.games;

public interface Game {
    String getGameRules();
    String getQuestion();
    String getRightAnswer();
    boolean isRightAnswer(String userAnswer);
    void changeQuestion();
}
