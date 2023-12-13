package loopsActivity;

import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int lower = 1;
        int upper = 100;
        int randomNumber = random.nextInt(upper - lower + 1) + lower;
        int numberOfGuesses = 0;
        boolean hasGuessedCorrectly = false;


        System.out.println("Guess a number between 1 and 100, or enter 'q' to quit.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            String input = console.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Quitter! The number was " + randomNumber);
                break;
            }
            try {
                int guess = Integer.parseInt(input);
                numberOfGuesses++;

                if (guess < lower || guess > upper) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Guess again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high. Guess again.");
                } else {
                    System.out.println("Correct!");
                    System.out.println("Number of guesses: " + numberOfGuesses);
                    hasGuessedCorrectly = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");
            }
        }
        console.close();
    }
}


