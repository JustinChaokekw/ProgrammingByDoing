import java.util.Scanner;

public class ALittleQuiz
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    int yn, A1, A2, A3, R1, R2, R3, G1, G2, G3;

    A1 = 2;
    A2 = 1;
    A3 = 3;

    System.out.print( "Are you ready for a quiz?(1 for yes and 2 for no) " );
    yn = keyboard.nextInt();

    if ( yn == 1 )
    {
      System.out.println( "Okay, here we go!" );

      System.out.println();
      System.out.println( "Q1: Which one is not one of the value types?" );
      System.out.println( "      1) String" );
      System.out.println( "      2) word" );
      System.out.println( "      3) int" );
      System.out.println();
      System.out.print( "> ");
      R1 = keyboard.nextInt();

      if ( R1 == A1 )
      {
        System.out.println();
        System.out.println( "Good start! That is correct!" );
        G1 = 1;
      }
      else
      {
        System.out.println();
        System.out.println( "The three types of values are String( for words), int( for integers), and double( for decimal numbers)!" );
        System.out.println( "Unfortunately, word is not one of them! " );
        G1 = 0;
      }

      System.out.println();
      System.out.println( "Q2: You should add ; after most of the codes." );
      System.out.println( "      1) True" );
      System.out.println( "      2) False" );
      System.out.println();
      System.out.print( "> ");
      R2 = keyboard.nextInt();

      if ( R2 == A2 )
      {
        System.out.println();
        System.out.println( "How clever! That is correct!" );
        G2 = 1;
      }
      else
      {
        System.out.println();
        System.out.println( "Well, at least you tried to type an answer here...?" );
        G2 = 0;
      }

      System.out.println();
      System.out.println( "Q3: What does the ln in System.out.println means?" );
      System.out.println( "      1) Long" );
      System.out.println( "      2) Last Note" );
      System.out.println( "      3) Next Line" );
      System.out.println();
      System.out.print( "> ");
      R3 = keyboard.nextInt();

      if ( R3 == A3 )
      {
        System.out.println();
        System.out.println( "Impressive! That is correct!" );
        G3 = 1;
      }
      else
      {
        System.out.println();
        System.out.println( "When you add ln after System.out.print, it would make the next displayed text start at the next line!" );
        G3 = 0;
      }

      System.out.println();
      System.out.println();
      System.out.println( "Overall, you got " + ( G1 + G2 + G3 ) + " out of 3 correct!" );
      System.out.println( "Thank you for playing!" );
    }
    else
    {
     System.out.println( "Okay, come back when you are prepared!" );
    }
  }
}
