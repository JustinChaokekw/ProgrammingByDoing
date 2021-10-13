import java.util.Scanner;
import java.util.Random;

public class NGWithACounter
{
  public static void main( String[] args ) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int cn = 1 + r.nextInt(10);
    int t = 0;

    System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
    System.out.print("Your guess: ");
    int g = keyboard.nextInt();
    t++;

    while ( g != cn )
    {
      System.out.println("That is incorrect.  Guess again.");
      System.out.print("Your guess: ");
      g = keyboard.nextInt();
      t++;
    }

    System.out.println("That's right!  You're a good guesser.");
    System.out.println("It only took you " + t + " tries.");
  }
}
