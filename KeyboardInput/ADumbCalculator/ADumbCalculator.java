import java.util.Scanner;

public class ADumbCalculator
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    double FNumber, SNumber, TNumber;

    System.out.print( "What is your first number? " );
    FNumber = keyboard.nextDouble();

    System.out.print( "What is your second number? " );
    SNumber = keyboard.nextDouble();

    System.out.print( "What is your third number? " );
    TNumber = keyboard.nextDouble();

    System.out.println( "" );
    System.out.println( "( " + FNumber + " + " + SNumber + " + " + TNumber + " ) / 2 is... " + ( (FNumber + SNumber + TNumber) / 2 ) );
  }
}
