import java.util.Scanner;

public class HangmanRunner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Welcome to Hangman.");
        
        // Add some print statements to explain the rules.
        
        // Ask Player 1 for a word or phrase
        Hangman game1 = new Hangman(keyboard.nextLine());
        
        // while neither player has reached the target score
            //Ask the next player for a word or phrase
            //Call newRound and pass the word or phrase in
    }
}
