public class IndDigits
{
  public static void main( String[] args )
  {
    for ( int f = 1 ; f < 10 ; f++ )
    {
      for ( int s = 0 ; s < 10 ; s++ )
      {
        System.out.println( ( f * 10 + s ) + ", " + f + " + " + s + " = " + ( f + s) );
      }
    }
  }
}
