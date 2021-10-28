import java.util.Scanner;
// 1. n= n+1 has the same use of n++; if it get removed, the program will never stop.
// 2. It initializes the value as 1.
// 3. n<=5 ==> n<=10

public class CountingFor
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "Type in a message, and I'll display it five times." );
    System.out.print( "Message: " );
    String message = keyboard.nextLine();

    for ( int n = 1 ; n <= 5 ; n = n+1 )
    {
      System.out.println( 2 * n + ". " + message );
    }
  }
}
