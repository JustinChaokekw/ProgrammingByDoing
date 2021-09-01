import java.util.Scanner;

public class BMICalculator
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    int FHeight, IHeight, PWeight;
    double MHeight, KWeight;

    System.out.print( "Your height (feet only): " );
    FHeight = keyboard.nextInt();

    System.out.print( "Your height (inches): " );
    IHeight = keyboard.nextInt();

    System.out.print( "Your weight in pounds: " );
    PWeight = keyboard.nextInt();

    System.out.println( "" );
    System.out.println( "Your BMI is " + ( PWeight * 0.453592 / ( ( FHeight * 0.3048 ) + ( IHeight * 0.0254 ) ) / ( ( FHeight * 0.3048 ) + ( IHeight * 0.0254 ) ) ) );
  }
}
