public class BasicArrays1
{
  public static void main( String[] args )
  {
    int[] Numbers = {0,0,0,0,0,0,0,0,0,0};

    for ( int i = 0 ; i <= 9 ; i++ )
    {
      Numbers[i] = (0-113);
      System.out.println("Slot 0 contains a " + Numbers[i]);
    }
  }
}
