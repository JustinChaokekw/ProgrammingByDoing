import java.util.Random;

public class FlickerPhrase
{
	public static void main( String[] args ) throws Exception
	{
		Random rng = new Random();
		int r;

		for ( int i=0; i<100000; i++ )
		{
			r = 1 + rng.nextInt(5);
			if ( r % 5 == 1 )
      {
        first();
      }
      else if ( r % 5 == 2 )
      {
        second();
      }
      else if ( r % 5 == 3 )
      {
        third();
      }
      else if ( r % 5 == 4 )
      {
        fourth();
      }
      else if ( r % 5 == 0 )
      {
        fifth();
      }

			Thread.sleep(50);
		}

		System.out.println("I pledge allegiance to the flag.");

	}

	public static void first()
	{
		System.out.print("I                               \r");
	}

	public static void second()
	{
		System.out.print("  pledge                        \r");
	}

	public static void third()
	{
		System.out.print("         allegiance             \r");
	}

	public static void fourth()
	{
		System.out.print("                    to the      \r");
	}

	public static void fifth()
	{
		System.out.print("                           flag.\r");
	}
}
