import java.util.Scanner;
import java.util.Random;

public class HiLoLimited
{
  public static void main( String[] args ) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int n = 1 + r.nextInt(100);
    int t = 1;

    System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
    System.out.print("Guess #" + t + ": ");
    int g = keyboard.nextInt();

    while ( g < n && t < 7)
    {
      t++;
      System.out.println("Too low.");
      System.out.print("Guess #" + t + ": ");
      g = keyboard.nextInt();
    }

    while ( g > n && t < 7)
    {
      t++;
      System.out.println("Too high.");
      System.out.print("Guess #" + t + ": ");
      g = keyboard.nextInt();
    }

    if ( t >= 7 )
    {
      System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
    }
    else
    {
      System.out.println("You guessed it!  What are the odds?!?");
    }

  }
}
