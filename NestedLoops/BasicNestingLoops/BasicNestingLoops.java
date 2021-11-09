public class BasicNestingLoops
{
  public static void main( String[] args )
  {
    for ( int a = 0 ; a < 6 ; a++ )
    {
      for ( int b = 0 ; b < 6 ; b++ )
      {
        System.out.print("(" + a + "," + b + ") ");
      }
      System.out.println();
    }
  }
}
