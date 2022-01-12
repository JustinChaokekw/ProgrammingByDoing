import java.util.Random;

public class BasicArrays3
{
  public static void main( String[] args )
  {
    Random r = new Random();

    int[] Numbers = new int[1000];

    for ( int i = 0 ; i <= 999 ; i++ )
    {
      int k = 11 + r.nextInt(89);
      Numbers[i] = k;
      System.out.print(Numbers[i] + "  ");
    }
  }
}
