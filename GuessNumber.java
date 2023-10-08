package ua.vodafone.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("Let's play the 'Guess the Number' game!");
        System.out.println("I guessed an integer from 0 to 10. You have three attempts to guess the number!");
        System.out.print("Input your number: ");

        int value = ThreadLocalRandom.current().nextInt(0, 11);

        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        for (int i = 0; i < attempts; i++) {
            int userNumber = scanner.nextInt();
            if (userNumber == value) {
                System.out.println("You WIN! My number was: " + value);
                break;
            } else if (i == (attempts - 1)) {
                System.out.println("It was your last attempt, you lost! :(");
                System.out.println("My number was: " + value);
                System.out.print(" Game over! ");
            } else {
                System.out.print("Nope! Try one more time: ");
            }
        }
    }
}
