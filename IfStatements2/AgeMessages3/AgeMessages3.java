import java.util.Scanner;

public class AgeMessages3
{
  public static void main( String[] args ) throws Exception
  {
    // For clarification, Ms. Tina, I only used else if statement to present the text,
    // -I have only used if statements for statements with int for age's(A) requirement.
    Scanner keyboard = new Scanner(System.in);

    String N;
    int A;

    for ( int k=0; k<11; k++ )
    {
      if ( k%11 == 0 )
        System.out.print("Y");
      else if ( k%11 == 1 )
        System.out.print("o");
      else if ( k%11 == 2 )
        System.out.print("u");
      else if ( k%11 == 3 )
        System.out.print("r");
      else if ( k%11 == 4 )
        System.out.print(" ");
      else if ( k%11 == 5 )
        System.out.print("n");
      else if ( k%11 == 6 )
        System.out.print("a");
      else if ( k%11 == 7 )
        System.out.print("m");
      else if ( k%11 == 8 )
        System.out.print("e");
      else if ( k%11 == 9 )
        System.out.print(":");
      else if ( k%11 == 10 )
        System.out.print(" ");

    Thread.sleep(50);
    }
    N = keyboard.next();

    for ( int j=0; j<10; j++ )
    {
      if ( j%10 == 0 )
        System.out.print("Y");
      else if ( j%10 == 1 )
        System.out.print("o");
      else if ( j%10 == 2 )
        System.out.print("u");
      else if ( j%10 == 3 )
        System.out.print("r");
      else if ( j%10 == 4 )
        System.out.print(" ");
      else if ( j%10 == 5 )
        System.out.print("a");
      else if ( j%10 == 6 )
        System.out.print("g");
      else if ( j%10 == 7 )
        System.out.print("e");
      else if ( j%10 == 8 )
        System.out.print(":");
      else if ( j%10 == 9 )
        System.out.print(" ");

    Thread.sleep(50);
    }
    A = keyboard.nextInt();

    System.out.println();

    if ( A < 16 )
    {
      for ( int j=0; j<19; j++ )
      {
        if ( j%19 == 0 )
          System.out.print("Y");
        else if ( j%19 == 1 )
          System.out.print("o");
        else if ( j%19 == 2 )
          System.out.print("u");
        else if ( j%19 == 3 )
          System.out.print(" ");
        else if ( j%19 == 4 )
          System.out.print("c");
        else if ( j%19 == 5 )
          System.out.print("a");
        else if ( j%19 == 6 )
          System.out.print("n");
        else if ( j%19 == 7 )
          System.out.print("'");
        else if ( j%19 == 8 )
          System.out.print("t");
        else if ( j%19 == 9 )
          System.out.print(" ");
        else if ( j%19 == 10 )
          System.out.print("d");
        else if ( j%19 == 11 )
          System.out.print("r");
        else if ( j%19 == 12 )
          System.out.print("i");
        else if ( j%19 == 13 )
          System.out.print("v");
        else if ( j%19 == 14 )
          System.out.print("e");
        else if ( j%19 == 15 )
          System.out.print(",");
        else if ( j%19 == 16 )
          System.out.print(" ");
        else if ( j%19 == 17 )
          System.out.print(N);
        else if ( j%19 == 18 )
          System.out.println(".");

        Thread.sleep(50);
      }
    }

    if ( A >= 16 && A <= 17 )
    {
      for ( int i=0; i<30; i++ )
      {
        if ( i%30 == 0 )
          System.out.print("Y");
        else if ( i%30 == 1 )
          System.out.print("o");
        else if ( i%30 == 2 )
          System.out.print("u");
        else if ( i%30 == 3 )
          System.out.print(" ");
        else if ( i%30 == 4 )
          System.out.print("c");
        else if ( i%30 == 5 )
          System.out.print("a");
        else if ( i%30 == 6 )
          System.out.print("n");
        else if ( i%30 == 7 )
          System.out.print(" ");
        else if ( i%30 == 8 )
          System.out.print("d");
        else if ( i%30 == 9 )
          System.out.print("r");
        else if ( i%30 == 10 )
          System.out.print("i");
        else if ( i%30 == 11 )
          System.out.print("v");
        else if ( i%30 == 12 )
          System.out.print("e");
        else if ( i%30 == 13 )
          System.out.print(" ");
        else if ( i%30 == 14 )
          System.out.print("b");
        else if ( i%30 == 15 )
          System.out.print("u");
        else if ( i%30 == 16 )
          System.out.print("t");
        else if ( i%30 == 17 )
          System.out.print(" ");
        else if ( i%30 == 18 )
          System.out.print("n");
        else if ( i%30 == 19 )
          System.out.print("o");
        else if ( i%30 == 20 )
          System.out.print("t");
        else if ( i%30 == 21 )
          System.out.print(" ");
        else if ( i%30 == 22 )
          System.out.print("v");
        else if ( i%30 == 23 )
          System.out.print("o");
        else if ( i%30 == 24 )
          System.out.print("t");
        else if ( i%30 == 25 )
          System.out.print("e");
        else if ( i%30 == 26 )
          System.out.print(",");
        else if ( i%30 == 27 )
          System.out.print(" ");
        else if ( i%30 == 28 )
          System.out.print(N);
        else if ( i%30 == 29 )
          System.out.println(".");

        Thread.sleep(50);
      }
    }

    if ( A >= 18 && A <= 24 )
    {
      for ( int h=0; h<35; h++ )
      {
        if ( h%35 == 0 )
          System.out.print("Y");
        else if ( h%35 == 1 )
          System.out.print("o");
        else if ( h%35 == 2 )
          System.out.print("u");
        else if ( h%35 == 3 )
          System.out.print(" ");
        else if ( h%35 == 4 )
          System.out.print("c");
        else if ( h%35 == 5 )
          System.out.print("a");
        else if ( h%35 == 6 )
          System.out.print("n");
        else if ( h%35 == 7 )
          System.out.print(" ");
        else if ( h%35 == 8 )
          System.out.print("v");
        else if ( h%35 == 9 )
          System.out.print("o");
        else if ( h%35 == 10 )
          System.out.print("t");
        else if ( h%35 == 11 )
          System.out.print("e");
        else if ( h%35 == 12 )
          System.out.print(" ");
        else if ( h%35 == 13 )
          System.out.print("b");
        else if ( h%35 == 14 )
          System.out.print("u");
        else if ( h%35 == 15 )
          System.out.print("t");
        else if ( h%35 == 16 )
          System.out.print(" ");
        else if ( h%35 == 17 )
          System.out.print("n");
        else if ( h%35 == 18 )
          System.out.print("o");
        else if ( h%35 == 19 )
          System.out.print("t");
        else if ( h%35 == 20 )
          System.out.print(" ");
        else if ( h%35 == 21 )
          System.out.print("r");
        else if ( h%35 == 22 )
          System.out.print("e");
        else if ( h%35 == 23 )
          System.out.print("n");
        else if ( h%35 == 24 )
          System.out.print("t");
        else if ( h%35 == 25 )
          System.out.print(" ");
        else if ( h%35 == 26 )
          System.out.print("a");
        else if ( h%35 == 27 )
          System.out.print(" ");
        else if ( h%35 == 28 )
          System.out.print("c");
        else if ( h%35 == 29 )
          System.out.print("a");
        else if ( h%35 == 30 )
          System.out.print("r");
        else if ( h%35 == 31 )
          System.out.print(",");
        else if ( h%35 == 32 )
          System.out.print(" ");
        else if ( h%35 == 33 )
          System.out.print(N);
        else if ( h%35 == 34 )
          System.out.println(".");

        Thread.sleep(50);
      }
    }

    if ( A >= 25 )
    {
      for ( int g=0; g<35; g++ )
      {
        if ( g%35 == 0 )
          System.out.print("Y");
        else if ( g%35 == 1 )
          System.out.print("o");
        else if ( g%35 == 2 )
          System.out.print("u");
        else if ( g%35 == 3 )
          System.out.print(" ");
        else if ( g%35 == 4 )
          System.out.print("c");
        else if ( g%35 == 5 )
          System.out.print("a");
        else if ( g%35 == 6 )
          System.out.print("n");
        else if ( g%35 == 7 )
          System.out.print(" ");
        else if ( g%35 == 8 )
          System.out.print("d");
        else if ( g%35 == 9 )
          System.out.print("o");
        else if ( g%35 == 10 )
          System.out.print(" ");
        else if ( g%35 == 11 )
          System.out.print("p");
        else if ( g%35 == 12 )
          System.out.print("r");
        else if ( g%35 == 13 )
          System.out.print("e");
        else if ( g%35 == 14 )
          System.out.print("t");
        else if ( g%35 == 15 )
          System.out.print("t");
        else if ( g%35 == 16 )
          System.out.print("y");
        else if ( g%35 == 17 )
          System.out.print(" ");
        else if ( g%35 == 18 )
          System.out.print("m");
        else if ( g%35 == 19 )
          System.out.print("u");
        else if ( g%35 == 20 )
          System.out.print("c");
        else if ( g%35 == 21 )
          System.out.print("h");
        else if ( g%35 == 22 )
          System.out.print(" ");
        else if ( g%35 == 23 )
          System.out.print("a");
        else if ( g%35 == 24 )
          System.out.print("n");
        else if ( g%35 == 25 )
          System.out.print("y");
        else if ( g%35 == 26 )
          System.out.print("t");
        else if ( g%35 == 27 )
          System.out.print("h");
        else if ( g%35 == 28 )
          System.out.print("i");
        else if ( g%35 == 29 )
          System.out.print("n");
        else if ( g%35 == 30 )
          System.out.print("g");
        else if ( g%35 == 31 )
          System.out.print(",");
        else if ( g%35 == 32 )
          System.out.print(" ");
        else if ( g%35 == 33 )
          System.out.print(N);
        else if ( g%35 == 34 )
          System.out.println(".");

        Thread.sleep(50);
      }
    }

  }
}
