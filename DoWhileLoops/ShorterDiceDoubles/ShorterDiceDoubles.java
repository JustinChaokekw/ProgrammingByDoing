import java.util.Random;

public class ShorterDiceDoubles
{
  public static void main ( String[] args ) throws Exception
  {
    Random r = new Random();
    int r1 = 1 + r.nextInt(6);
    int r2 = 1 + r.nextInt(6);
    int r3 = r1 + r2;

    System.out.println("HERE COMES THE DICE!");


    do{
      r1 = 1 + r.nextInt(6);
      r2 = 1 + r.nextInt(6);
      r3 = r1 + r2;

      for ( int x=0; x<3; x++ )
      {
        if ( x%3 == 0 )
          System.out.println("Roll #1: " + r1);
        if ( x%3 == 1 )
          System.out.println("Roll #2: " + r2);
        if ( x%3 == 2 )
          {
            System.out.println("The total is " + r3 + "!");
            System.out.println();
          }
        Thread.sleep(500);
        }
    }while ( r1 != r2);

    System.out.println("IT'S A DOUBLE!");
  }
}
