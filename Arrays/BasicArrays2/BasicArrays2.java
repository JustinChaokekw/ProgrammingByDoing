import java.util.Random;

public class BasicArrays2
{
  public static void main( String[] args )
  {
    Random r = new Random();

    int[] Numbers = {0,0,0,0,0,0,0,0,0,0};

    for ( int i = 0 ; i <= 9 ; i++ )
    {
      int k = 1 + r.nextInt(100);
      Numbers[i] = k;
      System.out.println("Slot " + i + " contains a " + Numbers[i]);
    }
  }
}
