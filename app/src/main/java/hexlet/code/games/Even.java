package hexlet.code.games;

import java.util.Scanner;

public class Even {

    private int countCorrectAnswers; // Счетчик правельных ответов

    private int currentNumber; // Текущее число
    private String correctAnswer; // Текущий правильный ответ
    private String userName;

    public Even() {
        this.countCorrectAnswers = 0;
        this.currentNumber = randValue();
        this.correctAnswer = isEven(currentNumber) ? "yes" : "no";
        this.userName = "";
    }

    public void start() {

        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name ? ");
        String uName = "";
        uName = scanner.next();
        System.out.println("Hello, " + uName);
        this.userName = uName;


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (this.countCorrectAnswers < 3) {
            System.out.println("Question: " + this.currentNumber);
            System.out.print("Your answer: ");
            String yourAnswer = getUserAnswer();

            if (this.correctAnswer.equalsIgnoreCase(yourAnswer)) {
                System.out.println("Correct!");
                currentNumber = randValue();
                correctAnswer = isEven(currentNumber) ? "yes" : "no";
                countCorrectAnswers++;
            } else {
                System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was '"
                        + this.correctAnswer + "'.");
                countCorrectAnswers = 0;
                currentNumber = randValue();
            }
        }
        System.out.println("Congratulations, " + this.userName);
        scanner.close();
    }



    // Выдаем случайное число от LOWER_BOUND до UPPER_BOUND
    private static int randValue() {
        final int upperBound = 25;
        final int lowerBound = 1;
        return (int) (Math.random() * (upperBound - lowerBound)) + lowerBound;
    }

    // Проверка на четность
    private boolean isEven(int num) {
        if (num < 0) {
            return false;
        }
        return num % 2 == 0;
    }

    // Получить ответ от пользователя
    private String getUserAnswer() {
        Scanner basicInputStream = new Scanner(System.in);
        String userAnswer;
        userAnswer = basicInputStream.next();
        return userAnswer;
    }

}
