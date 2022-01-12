import java.io.*;
import java.util.*;
import java.util.Random;

public class GradesAF
{
  public static void main( String[] args ) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int[] T = new int[5];

    String F, L, fn;

    System.out.print( "Name (first last): " );
    F = keyboard.next();
    L = keyboard.next();

    System.out.print( "Filename: " );
    fn = keyboard.next();

    System.out.println();
    System.out.println( "Here are your randomly-selected grades (hope you pass):" );

    for( int i = 0 ; i < 5 ; i++ )
    {
      int u = 1 + r.nextInt(100);
      T[i] = u;
      System.out.println("Grade " + i + ": " + T[i]);
    }

    File kekw = new File(fn);
    FileWriter fw = new FileWriter(kekw);
    PrintWriter pw = new PrintWriter(fw);
      pw.print(F + " " + L);
      for( int i = 0 ; i < 5 ; i++ )
      {
        pw.print("Grade " + i + ": " + T[i] + " ");
      }

    System.out.println();
    System.out.println( "Data saved in \"" + fn + "\"." );
  }
}
