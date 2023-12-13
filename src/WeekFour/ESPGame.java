package WeekFour;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int totalGuesses = 10;
        int correctGuesses = 0;

        String[] colors = {"red", "green", "blue", "orange", "yellow"};

        for (int i = 0; i < totalGuesses; i++) {
            int randomIndex = random.nextInt(colors.length);
            String computerColor = colors[randomIndex];

            System.out.print("What color has the computer chosen? (red, green, blue, orange, yellow): ");
            String userGuess = console.nextLine().toLowerCase();


            System.out.println("The computer chose " + computerColor);


            if (userGuess.equals(computerColor)) {
                System.out.println("Correct!");
                correctGuesses++;
            } else {
                System.out.println("Incorrect.");
            }
            System.out.println();
        }

        System.out.println("You guessed " + correctGuesses + " out of " + totalGuesses + " colors correctly.");

        console.close();
    }
}

