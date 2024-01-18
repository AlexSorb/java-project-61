package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;


public class Engine {
    private String userName;
    private final int countLives = 3;

    public Engine() {
        this.userName = "";
    }

    public void start(String gameName) {
        greeting();
        switch (gameName) {
            case "Even":
                startEven();
                break;
            case "Calc":
                startCalc();
                break;
            case "GCD":
                startGCD();
                break;
            case "Progression":
                startProgression();
                break;
            case "Prime":
                startPrime();
                break;
            default:
                break;
        }
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

    private void startCalc() {
        Calc calcGame = new Calc();
        System.out.println(calcGame.getGameRules());
        for (int i = 0; i < countLives; i++) {
            System.out.println("Question: " + calcGame.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = getUserInput();
            if (calcGame.isRightAnswer(userAnswer)) {
                System.out.println("Correct!");
                calcGame.changeQuestion();
            } else {
                wrongAnswer(userAnswer, calcGame.getRightAnswer());
                return;
            }
        }
        winGame();
    }

    private void startEven() {
        Even evenGame = new Even();
        System.out.println(evenGame.getGameRules());
        for (int i = 0; i < countLives; i++) {
            System.out.println("Question: " + evenGame.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = getUserInput();
            if (evenGame.isRightAnswer(userAnswer)) {
                System.out.println("Correct!");
                evenGame.changeQuestion();
            } else {
                wrongAnswer(userAnswer, evenGame.getRightAnswer());
                return;
            }
        }
        winGame();
    }

    private void startGCD() {
        GCD gcdGame = new GCD();
        System.out.println(gcdGame.getGameRules());
        for (int i = 0; i < countLives; i++) {
            System.out.println("Question: " + gcdGame.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = getUserInput();
            if (gcdGame.isRightAnswer(userAnswer)) {
                System.out.println("Correct!");
                gcdGame.changeQuestion();
            } else {
                wrongAnswer(userAnswer, gcdGame.getRightAnswer());
                return;
            }
        }
        winGame();
    }
    private void startPrime() {
        Prime primeGame = new Prime();
        System.out.println(primeGame.getGameRules());
        for (int i = 0; i < countLives; i++) {
            System.out.println("Question: " + primeGame.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = getUserInput();
            if (primeGame.isRightAnswer(userAnswer)) {
                System.out.println("Correct!");
                primeGame.changeQuestion();
            } else {
                wrongAnswer(userAnswer, primeGame.getRightAnswer());
                return;
            }
        }
        winGame();
    }

    private void startProgression() {
        Progression progressionGame = new Progression();
        System.out.println(progressionGame.getGameRules());
        for (int i = 0; i < countLives; i++) {
            System.out.println("Question: " + progressionGame.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = getUserInput();
            if (progressionGame.isRightAnswer(userAnswer)) {
                System.out.println("Correct!");
                progressionGame.changeQuestion();
            } else {
                wrongAnswer(userAnswer, progressionGame.getRightAnswer());
                return;
            }
        }
        winGame();
    }
}
