import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
  public static void main( String[] args ) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);

    Random r = new Random();

    int M, b;
    String nrc;
    int p1c = 2 + r.nextInt(9);
    int p2c = 2 + r.nextInt(9);
    int d1c = 2 + r.nextInt(9);
    int d2c = 2 + r.nextInt(9);
    int ptc = p1c + p2c;
    int dtc = d1c + d2c;

    System.out.println( "Your cards are " + p1c + " & " + p2c + "." );
    System.out.println( "Your cards' sum is " + ptc + "." );
    System.out.println( "The dealer's card shown is " + d1c + "." );

    do{
      System.out.println( "hit or stand?" );
      System.out.print( "> " );
      nrc = keyboard.next();

      if( nrc.equals("hit") )
      {
        int pnc = 2 + r.nextInt(9);
        ptc = ptc + pnc;
        System.out.println( "Your new card is " + pnc + "." );
        System.out.println( "Your cards' sum is " + ptc + "." );
        System.out.println( "The dealer's card shown is " + d1c + "." );
      }
    }while( !nrc.equals("stand") && ptc < 21 );

    if( ptc > 21 )
    {
      System.out.println( "Busted!" );
    }
    else if( ptc < d2c )
    {
      System.out.println( "The dealer's hidden card is " + d2c + "." );
      System.out.println( "The dealer's card's sum is " + dtc + "." );
      System.out.println( "You lost!" );
    }
    else if( ptc == d2c )
    {
      System.out.println( "The dealer's hidden card is " + d2c + "." );
      System.out.println( "The dealer's card's sum is " + dtc + "." );
      System.out.println( "It's a tie!" );
    }
    else if( ptc > d2c )
    {
      int dnc = 2 + r.nextInt(9);

      do{
        dtc = dtc + dnc;

        for ( int i=0; i<2; i++ )
        {
          if ( i%2 == 0 )
          {
            System.out.println( "The dealer's new card is " + d2c + "." );
            System.out.println( "The dealer's card's sum is " + dtc + "." );
          }
          else if ( i%2 == 1 )
          {
            System.out.println();
          }
          Thread.sleep(500);
        }
      }while( dtc < ptc && dtc < 21 );

    if( dtc > 21 )
    {
      System.out.println( "The dealer got busted!" );
      System.out.println( "You won!" );
    }

    if( dtc == ptc )
    {
      System.out.println( "It's a tie!" );
    }

    if( dtc <= 21 && dtc > ptc )
    {
      System.out.println( "You lost!" );
    }

    }
  }
}
