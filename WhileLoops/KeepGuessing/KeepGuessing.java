import java.util.Scanner;
import java.util.Random;

public class KeepGuessing
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int n = 1 + r.nextInt(10);
    int g;

    System.out.println("I have a chosen number between 1 and 10. Try to guess it.");
    System.out.print("Your guess: ");
    g = keyboard.nextInt();

    while ( g != n )
    {
      System.out.println("That is incorrect. Guess again.");
      System.out.print("Your guess: ");
      g = keyboard.nextInt();
    }

    System.out.println("That's right! You're a good guesser.");
  }
}
