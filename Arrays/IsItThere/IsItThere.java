import java.io.*;
import java.util.*;

public class IsItThere
{
  public static void main( String[] args ) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int[] A = new int[10];
    int V;
    int T = 0;

    System.out.print("Array: ");

    for( int i = 0 ; i < 10 ; i++ )
    {
      int h = 1 + r.nextInt(50);
      A[i] = h;
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

    if( T > 0 )
    {
      System.out.println( V + " is in the array.");
    }
    else
    {
      System.out.println( V + " is not in the array.");
    }
  }
}
