import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean guessed = false;
        int maxGuesses = 5;
        int guesses = 0;
        int randomNumber = rand.nextInt(10);
        //System.out.println("DEBUG: " + randomNumber);

        while (guesses <= maxGuesses && !guessed) {
            System.out.print("Guess a number between 1 and 10: ");
            int guess = scanner.nextInt();
            if(guess == randomNumber) {
                guessed = true;
            }
            else {
                if (guess > randomNumber) {
                    System.out.println("Too high, try again.");
                }
                if (guess < randomNumber) {
                    System.out.println("Too low, try again.");
                }
            }
            guesses++;
        }

        if (guessed) {
            System.out.println("Congratulations! You've guessed the correct number.");

        }
        else {
            System.out.println(String.format("The number was %d.", randomNumber));
        }

    }
}
