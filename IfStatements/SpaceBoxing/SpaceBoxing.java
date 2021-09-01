import java.util.Scanner;

public class SpaceBoxing
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    int Weight, PlanetNo;
    double V, M, J, S, U, N;

    V = 0.78;
    M =	0.39;
    J = 2.65;
    S = 1.17;
    U = 1.05;
    N = 1.23;

    System.out.print( "Please enter your current earth weight: " );
    Weight = keyboard.nextInt();

    System.out.println();
    System.out.println( "I have information for the following planets:" );
    System.out.println( "   1. Venus   2. Mars    3. Jupiter" );
    System.out.println( "   4. Saturn  5. Uranus  6. Neptune" );
    System.out.println();

    System.out.println( "Which planet are you visiting? " );
    PlanetNo = keyboard.nextInt();

    System.out.println();

    if ( PlanetNo == 1 )
    {
      System.out.println( "Your weight would be " + ( Weight * V ) + " pounds on that planet." );
    }
    else if ( PlanetNo == 2 )
    {
      System.out.println( "Your weight would be " + ( Weight * M ) + " pounds on that planet." );
    }
    else if ( PlanetNo == 3 )
    {
      System.out.println( "Your weight would be " + ( Weight * J ) + " pounds on that planet." );
    }
    else if ( PlanetNo == 4 )
    {
      System.out.println( "Your weight would be " + ( Weight * S ) + " pounds on that planet." );
    }
    else if ( PlanetNo == 5 )
    {
      System.out.println( "Your weight would be " + ( Weight * U ) + " pounds on that planet." );
    }
    else if ( PlanetNo == 6 )
    {
      System.out.println( "Your weight would be " + ( Weight * N ) + " pounds on that planet." );
    }
  }
}
