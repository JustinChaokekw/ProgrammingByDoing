import java.util.Random;

public class Randomness
{
  // Questions
  // 1. I believe the range without "1 +" is 0 - 4, which makes sense since it is the first 5 integers.
  // 2. No, it is not. It is 3 - 7.
  // 3. When we enter the seed 12353, every number become the same everytime.
  // 4. In fact, whenever a seed is entered, the number are going to be the same.
  public static void main ( String[] args )
  {
    Random r = new Random();

    int x = 1 + r.nextInt(10);

    System.out.println( "My random number is " + x + "." );

    System.out.println( "Here are some number from 1 to 5!" );
    System.out.print( 1 + r.nextInt(5) + " " );
    System.out.print( 1 + r.nextInt(5) + " " );
    System.out.print( 1 + r.nextInt(5) + " " );
    System.out.print( 1 + r.nextInt(5) + " " );
    System.out.print( 1 + r.nextInt(5) + " " );
    System.out.print( 1 + r.nextInt(5) + " " );
    System.out.println();

    System.out.println( "Here are some number from 1 to 100!" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.print( 1 + r.nextInt(100) + "\t" );
    System.out.println();

    int num1 = 1 + r.nextInt(10);
    int num2 = 1 + r.nextInt(10);

    if ( num1 == num2 )
    {
      System.out.println( "The random numbers were the same! Weird." );
    }
    if ( num1 != num2 )
    {
      System.out.println( "The random numbers were different! Not too surprising, actually." );
    }
  }
}
