// Guess Game:-

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int min = 1;    
        int max = 100;
        int range = max-min+1;
        int randomnumber = rn.nextInt(range) + min;
        
        int attempts = 0;
        int guessnumber;

        System.out.println("You will get only 10 attempts.");

        do {
            System.out.print("Guess any number between 1 to 100: ");
            guessnumber = sc.nextInt();
            attempts++;
            System.out.println();
            
            if (guessnumber == randomnumber) {
            System.out.println("You win.\nGuess number is correct.");
            } else if (guessnumber < randomnumber) {
                System.out.println("Guess number is low.\nTry again.\nEnter some high number.");
            } else if (guessnumber > randomnumber) {
                System.out.println("Guess number is high.\nTry again.\nEnter some low number.");
            }
            System.out.println("YOUR REMAINING ATTEMPTS: " + (10-attempts));
            System.out.println("------------------------------------");

            if (attempts>=10) {
                break;
            }

        } while (guessnumber != randomnumber);

        System.out.println("Random number was: " + randomnumber);
        System.out.println("You have taken " + attempts + " Attempts");

        sc.close();
    }
}


