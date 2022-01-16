import java.util.Scanner;
import java.util.Random;

public class Hangman
{

  private static String[] wordlist = {"smithereen", "fuzzy", "emptiness", "why", "narcissist", "together", "savoury"};
	private static char[] w = new char[20];
	private static char[] m = new char[20];
	private static int misss;

  public static void main( String[] args )
  {
    int choice;

    Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

    do
    {
      String whichone = wordlist[r.nextInt(7)];
      misss = 0;
      start(whichone.length());
      do
      {
        display(whichone.length());
        guessword(whichone.length(), whichone);
      }while (misss <= (whichone.length() - 1) && !checkwin(whichone.length()));
      display(whichone.length());

			if (misss > (whichone.length() - 1))
      {
        System.out.println("Sorry, you have made too many tries! The word is " + whichone + ".");
      }

      if (checkwin(whichone.length()))
      {
				System.out.println("You have won the game! Yes, the word is " + whichone + "!");
			}

      System.out.println("Would you like to play again? (0 for quit and 1 for again)");
      System.out.print("> ");
      choice = keyboard.nextInt();
    }while(choice == 1);
  }

  public static void display(int wordlength)
  {
    System.out.println("");
    System.out.println("|-<=-=>-|-<=-=>-|-<=-=>-|-<=-=>-|");
    System.out.println("");
    System.out.print("Word: \t");

    for (int i = 0; i < wordlength; i++)
    {
      System.out.print(w[i]+ " ");
    }

    System.out.println("");
    System.out.print("Misses:\t");
		for (int i = 0; i < misss; i++)
    {
			System.out.print(m[i]);
		}
    System.out.println("");
  }

  public static void start(int wordlength)
  {
    for (int i = 0; i < wordlength; i++)
    {
      w[i] = '_';
    }
  }

  public static void guessword(int wordlength, String whichone)
  {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Guess: \t");
		char guess = keyboard.next().charAt(0);
		int hit = 0;

		for (int i = 0; i < wordlength; i++)
    {
			if (guess == whichone.charAt(i))
      {
				w[i] = guess;
				hit = 1;
			}
		}
    if (hit == 0)
    {
			m[misss] = guess;
			misss++;
    }
  }

  public static boolean checkwin(int wordlength)
  {
		for (int i = 0; i < wordlength; i++)
    {
			if (w[i] == '_')
      {
				return false;
			}
		}
		return true;
	}
}
