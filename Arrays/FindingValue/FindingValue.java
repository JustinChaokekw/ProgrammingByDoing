import java.io.*;
import java.util.*;

public class FindingValue
{
  public static void main( String[] args ) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int[] A = new int[10];

    int V;

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
        System.out.println( V + " is in the array.");
      }
      else
      {
        System.out.print("");
      }
    }
  }
}
