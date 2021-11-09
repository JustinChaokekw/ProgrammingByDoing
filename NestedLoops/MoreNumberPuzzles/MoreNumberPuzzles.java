import java.util.Scanner;

public class MoreNumberPuzzles
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    int choice;

    do
    {
      System.out.println( "1. Find two digit numbers <= 56 with sums of digits > 10" );
      System.out.println( "2. Find two digit number minus number reversed which equals sum of digits" );
      System.out.println( "3. Quit" );
      System.out.println("");
      System.out.print( "> " );
      choice = keyboard.nextInt();

      System.out.println("");

      if( choice == 1 )
      {
        for( int f = 0 ; f <= 5 ; f++ )
        {
          for( int u = 0 ; u < 10 ; u++ )
          {
            if( (f*10+u) <= 56 && (f+u) > 10 )
            {
              System.out.println((f*10+u));
            }
            else
            {
              System.out.print("");
            }
          }
        }
      }
  else if( choice == 2 )
      {
        for( int c = 0 ; c < 10 ; c++ )
        {
          for( int k = 0 ; k < 10 ; k++ )
          {
             if( (c*10+k)-(k*10+c) == (c+k) )
             {
              System.out.println((c*10+k));
             }
             else
             {
              System.out.print("");
             }
          }
        }
      }
      else if( choice == 3 )
      {
        System.out.print("");
      }
      else
      {
        System.out.println("bruh, try harder");
      }
    }while( choice != 3 );
  }
}
