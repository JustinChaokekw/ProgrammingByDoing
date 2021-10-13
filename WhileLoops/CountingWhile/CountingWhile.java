import java.util.Scanner;
// 1. n++ would increase n by 1 every time the loop is implemented.
// , and if it is taken away, the loop will never stop.


public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		System.out.print( "How many times?: " );
		int number = keyboard.nextInt();

		int n = 0;
		while ( n < (number+1) )
		{
			System.out.println( ((n+1)*10) + ". " + message );
			n++;
		}

	}
}
