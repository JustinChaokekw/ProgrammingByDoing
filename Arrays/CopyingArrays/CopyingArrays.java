import java.util.Random;
public class CopyingArrays
{
  public static void main( String[] args )
  {
    Random r = new Random();

    int[] A = new int[10];
    int[] B = new int[10];

    for ( int i = 0 ; i <= 9 ; i++ )
    {
      int k = 1 + r.nextInt(100);
      A[i] = k;
      B[i] = k;
    }

    A[9] = (0-7);

    System.out.print("Array 1: ");

    for ( int e = 0 ; e <= 9 ; e++ )
    {
      System.out.print(A[e] + " ");
    }

    System.out.println("");
    System.out.print("Array 2: ");

    for ( int d = 0 ; d <= 9 ; d++ )
    {
      System.out.print(B[d] + " ");
    }
  }
}
