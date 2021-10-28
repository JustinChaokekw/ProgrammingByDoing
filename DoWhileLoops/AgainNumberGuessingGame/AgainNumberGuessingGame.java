import java.util.Random;
import java.util.Scanner;

public class AgainNumberGuessingGame
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int x = 1 + r.nextInt(10);
    int y;
    int z = 0;

    System.out.println( "I'm thinking of a number from 1 to 10." );
    System.out.print( "Your guess: " );
    y = keyboard.nextInt();

    do{
      z++;
      System.out.println( "That is incorrect.  Guess again." );
      System.out.print( "Your guess: " );
      y = keyboard.nextInt();
    }while( y != x );

    System.out.println( "That's right! You're a good guesser." );
    System.out.println( "It only took you " + z + " tries." );
  }
}
