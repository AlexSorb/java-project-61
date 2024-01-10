package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.*;

public class Engine {
    private String userName;
    private final int countLives = 3;


    public Engine() {
        this.userName = "";
    }

    public void start(String gameName) {
        switch (gameName) {
            case "Even":
                startGame(new Even());
                break;
            case "Calc":
                startGame(new Calc());
                break;
            case "GCD":
                startGame(new GCD());
            case "Progression":
                startGame(new Progression());
            default:
                break;
        }
    }
    private void startGame(Game anotherGame) {
        greeting();
        System.out.println(anotherGame.getGameRules());
        for (int i = 0; i < countLives; i++) {
            System.out.println("Question: " + anotherGame.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = getUserInput();
            if (anotherGame.isRightAnswer(userAnswer)) {
                System.out.println("Correct!");
                anotherGame.changeQuestion();
            } else {
                wrongAnswer(userAnswer, anotherGame.getRightAnswer());
                return;
            }
        }
        winGame();
    }

    private void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name ? ");
        Scanner scanner = new Scanner(System.in);
        String uName = scanner.next();
        System.out.println("Hello, " + uName);
        this.userName = uName;
    }

    private String getUserInput() {
        String userInput = "";
        Scanner inputStr = new Scanner(System.in);
        userInput = inputStr.next().trim();
        return userInput;
    }
    private void winGame() {
        System.out.println("Congratulations, " + this.userName + " !");
    }
    private void wrongAnswer(String userAnswer, String rightAnswer) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                + rightAnswer + "'.");
        System.out.println("Let's try again, " + this.userName + "!");
    }


    public static int randomIntValue(int leftBorder, int rightBorder) {
        return (int) (Math.random() * (rightBorder - leftBorder)) + leftBorder;
    }
    public static int randomIntValue() {
        final int left = 1;
        final int right = 26;
        return randomIntValue(left, right);
    }
}
