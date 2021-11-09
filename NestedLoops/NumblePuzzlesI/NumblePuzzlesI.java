public class NumblePuzzlesI
{
  public static void main( String[] args )
  {
    for( int a = 10 ; a < 61 ; a++ )
    {
      for ( int b = 10; b < 61 ; b++ )
      {
        if ( ( a + b ) == 60 && ( a - b ) == 14 )
        {
          System.out.println( a + " | " + b );
        }
        else
        {
          System.out.print("");
        }
      }
    }
  }
}
