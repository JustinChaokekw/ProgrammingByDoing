import java.util.Scanner;

public class FizzBuzz
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    for ( int n = 1 ; n <= 100 ; n = n+1 )
    {
      if( n % 3 == 0 && n % 5 == 0 )
      {
        System.out.println( "FizzBuzz" );
      }
      else if( n % 3 == 0 && n % 5 != 0 )
      {
        System.out.println( "Fizz" );
      }
      else if( n % 3 != 0 && n % 5 == 0 )
      {
        System.out.println( "Buzz" );
      }
      else
      {
        System.out.println( n );
      }
    }
  }
}
