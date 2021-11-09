import java.io.*;
import java.util.*;

public class Summing
{
	public static void main( String[] args ) throws Exception
	{
		int a, b, c;

		File in = new File("3nums.txt");
		Scanner input = new Scanner(in);

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		System.out.println( "Reading numbers from file \"3nums.txt\"... done." );
		System.out.println( "" );
		System.out.println( a + " + " + b + " + " + c + " = " + (a+b+c) );
	}
}
