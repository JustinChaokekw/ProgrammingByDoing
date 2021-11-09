public class EvennessFunction
{
  public static void main (String[] args)
  {
    int n;
    String x;

    for ( n = 1 ; n <= 20 ; n++ )
    {
      if ( isEven(n) == true && isDivisibleBy3(n) == true )
        x = "<=";
      else if ( isEven(n) == true && isDivisibleBy3(n) == false )
        x = "<";
      else if ( isEven(n) == false && isDivisibleBy3(n) == true )
        x = "=";
      else
        x = "";

      System.out.println(n + " " + x );
    }
  }

  public static boolean isEven( int n )
  {
    if ( n%2 == 0 )
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static boolean isDivisibleBy3( int n )
  {
    if ( n%3 == 0 )
    {
      return true;
    }
    else if ( n%3 == 1 )
    {
      return false;
    }
    else
    {
      return false;
    }
  }
}
