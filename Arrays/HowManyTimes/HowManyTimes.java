import java.io.*;
import java.util.*;

public class HowManyTimes
{
  public static void main( String[] args ) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int[] A = new int[10];
    int V, Y;
    int T = 0;

    for( int i = 0 ; i < 10 ; i++ )
    {
      int h = 1 + r.nextInt(50);
      A[i] = h;
    }
    
    do{
      System.out.print("Array: ");

      for( int i = 0 ; i < 10 ; i++ )
      {
        System.out.print( A[i] + " ");
      }

      System.out.println("");
      System.out.print("Value to find: ");
      V = keyboard.nextInt();

      System.out.println("");

      for( int i = 0 ; i < 10 ; i++ )
      {
        if(A[i] == V)
        {
          T++;
        }
        else
        {
          System.out.print("");
        }
      }

      System.out.println( V + " was found " + T + " times.");

      T = 0;

      System.out.println("");
      System.out.println("Do we want another round? (0 for yes, 1 for no): ");
      Y = keyboard.nextInt();

      System.out.println("");
    }while( Y == 0 );


  }
}
