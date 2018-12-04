import java.util.Scanner;

public class Hangman
{
    //instance variables
    private String theWord = "";
    private String guessingWord = "";
    private int p1Score = 0;
    private int p2Score = 0;
    private boolean p1turn = true;
    private String guesslist = "";
    
    //constructors
    public Hangman(String toGuess)
    {
        theWord = toGuess;
        createTheBlanks();
        playRound();
    }
    
    // Create get methods for p1Score, p2Score, and p1Turn
    
    public void createTheBlanks()
    {
        // create the guessingWord with a blank for every letter in theWord.
       
    }
    
    public void newRound(String toGuess)
    {
        theWord = toGuess;
        createTheBlanks();
        p1turn = !p1turn; //what does this do?
        playRound();
    }
    
    public void playRound()
    {
        int numguess = 0;
        String letterguess = "";
        Scanner keyboard = new Scanner(System.in);
        
        // while the round is still going (the user hasn't guessed the word or run out of attempts)
        // ask the user for a guess and use Scanner to get the guess from the keyboard
        // check to make sure the guess matches the rules - if not, ask the user for another guess
        // call the method to process the guess
        // increment numguess
      
        
        
        //update the score as following (you will need to pay attention to whose turn it is)
        // if the round ended because the word was guessed, congradulate the player and add
        //the number of guesses to their score
        // if the round ended because the player ran out of guesses, say something along the lines of
        // "Too bad" and add the appropriate amount to their score
        
        gameStatus();
      
    }
    
    public boolean guessOkay(String guess)
    {
        // return true if the guess meets all of the established rules
        // otherwise return false
        return true;
    }
    
    public void processGuess(String guess)
    {
        //Add the guess to the list of guessed letters
        
        // If the guessed letter occurs in the secret word, replace the appropriate blanks in the
        // guessing word with it.
        
    }
    
    public void gameStatus()
    {
        //Print updates about the players scores
        System.out.print("");
    }
}
