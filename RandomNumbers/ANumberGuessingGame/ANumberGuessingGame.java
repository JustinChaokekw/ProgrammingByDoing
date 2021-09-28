import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    Random r = new Random();

    int x = 1 + r.nextInt(10);

    int y;

    System.out.println( "I'm thinking of a number from 1 to 10." );
    System.out.print( "Your guess: " );
    y = keyboard.nextInt();

    if (y == x)
    {
      System.out.println( "That's right!  My secret number was " + x + "!" );
    }
    else
    {
      System.out.println( "Sorry, but I was really thinking of " + x + "." );
    }
  }
}
