import java.util.*;
public class Guess {

    public static void main (String []args){
        // generate secret number
        var secretNum = (int)(Math.random()*12+1);
        Scanner keyboard = new Scanner(System.in);
        var numGuesses = 0;
        var guess = 0;
        while (guess != secretNum) {
            System.out.print("Enter your guess: ");
            guess = keyboard.nextInt();
            ++numGuesses;
            
            // Give feedback on guess
            if (guess < secretNum) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNum) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("You got it!!");
            }
        }
        System.out.println("It took you " + numGuesses + " guesses.");
        keyboard.close();
    }
}
