public class NestingLoops
{
// 1. n
// 2. the number will be printed out first, and c will be the variable that changes the fast.
// 3. When we make it println(), the list of datas will line up vertically
// 4. The statement will appear after time the inner loop ended.

	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"

		for ( int n=1; n <= 3; n++ )
		{
      for ( char c='A'; c <= 'E'; c++ )
      {
			    System.out.println( c + " " + n );
      }
		}


		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.println( a + "-" + b + " " );
			}
			System.out.println( ":)" );
		}

		System.out.println("\n");

	}
}
