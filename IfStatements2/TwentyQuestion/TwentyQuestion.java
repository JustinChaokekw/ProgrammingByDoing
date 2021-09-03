import java.util.Scanner;

public class TwentyQuestion
{
  public static void main( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    String A1, A2;

    System.out.println( "TWO QUESTIONS!" );
    System.out.println( "Think of an object, and I'll try to guess it." );

    System.out.println();
    System.out.println( "Question 1) Is it animal, vegetable, or mineral?" );
    System.out.print( "> " );
    A1 = keyboard.next();

    System.out.println();
    System.out.println( "Question 2) Is it bigger than a breadbox?" );
    System.out.print( "> " );
    A2 = keyboard.next();

    System.out.println();
    System.out.print( "My guess is that you are thinking of a" );

    if ( A1.equals("animal") )
    {
      if ( A2.equals("yes") )
      {
        System.out.println( " deer." );
      }
      else if ( A2.equals("no") )
      {
        System.out.println( " mouse." );
      }
    }
    else if ( A1.equals("vegetable") )
    {
      if ( A2.equals("yes") )
      {
        System.out.println( " pumpkin." );
      }
      else if ( A2.equals("no") )
      {
        System.out.println( " cherry." );
      }
    }
    else if ( A1.equals("mineral") )
    {
      if ( A2.equals("yes") )
      {
        System.out.println( " ship." );
      }
      else if ( A2.equals("no") )
      {
        System.out.println( " magnet." );
      }
    }

    System.out.println( "I would ask you if I'm right, but I don't actually care." );

  }
}
