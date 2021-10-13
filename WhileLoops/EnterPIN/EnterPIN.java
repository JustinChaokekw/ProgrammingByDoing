import java.util.Scanner;
	// 1. A while loop is similar to an if statement since they both are detecting whether a condition is happening or not.
	// 2. The difference is while loop stop when a condition is true, but if statement is implemented.
	// 3. Beacuase it was already defined outside the while loop.
	// 4. It glitches and keeps on sending the same message since there is no time duration in between to wait for the answer.
public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}
