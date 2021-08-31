import java.util.Scanner;

public class MoreUserInputOfData
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    String FName, LName, Login;
    int Grade, ID;
    double GPA;

    System.out.println( "Please enter the following information so I can sell it for a profit!" );
    System.out.println( "" );
    System.out.print( "First name: " );
    FName = keyboard.next();

    System.out.print( "Last name: " );
    LName = keyboard.next();

    System.out.print( "Grade (9-12): " );
    Grade = keyboard.nextInt();

    System.out.print( "Student ID: " );
    ID = keyboard.nextInt();

    System.out.print( "Login: " );
    Login = keyboard.next();

    System.out.print( "GPA (0.0-4.0): " );
    GPA = keyboard.nextDouble();

    System.out.println( "" );
    System.out.println( "Your Information: " );
    System.out.println( "   Login: " + Login );
    System.out.println( "   ID: " + ID );
    System.out.println( "   Name: " + LName + ", " + FName );
    System.out.println( "   GPA: " + GPA );
    System.out.println( "   Grade: " + Grade );
  }
}
