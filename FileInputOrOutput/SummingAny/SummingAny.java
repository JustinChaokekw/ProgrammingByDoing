import java.io.*;
import java.util.*;

public class SummingAny
{
  public static void main( String[] args ) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);

    String t;
    int a, b, c;

	   System.out.print( "Which file would you like to read numbers from: " );
     t = keyboard.next();

		File in = new File(t);
		Scanner input = new Scanner(in);

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		System.out.println( "Reading numbers from file \"" + t +"\"" );
		System.out.println( "" );
		System.out.println( a + " + " + b + " + " + c + " = " + (a+b+c) );
  }
}
