import java.util.Scanner;

public class AddingInLoop
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    int n;
    int sum = 0;

    System.out.println("I will add up the numbers you give me.");
    System.out.print("Number: ");
    n = keyboard.nextInt();

    while ( n != 0 )
    {
      sum = sum + n;
      System.out.println("The total so far is " + sum + ".");
      System.out.print("Number: ");
      n = keyboard.nextInt();
    }

    System.out.println("The total is " + sum + ".");
  }
}
