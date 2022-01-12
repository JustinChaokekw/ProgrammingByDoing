import java.util.*;

public class ALFindingAValue
{
  public static int getNumbers()
  {
    Random r = new Random();
    int h = 1 + r.nextInt(100);
    return h;
  }

  public static void main(String[] args)
  {
    Scanner yo = new Scanner(System.in);
    ArrayList<Integer> huh = new ArrayList<Integer>();
    for ( int i = 1; i <= 10 ; i++ )
    {
      huh.add(getNumbers());
    }
    System.out.println("ArrayList: " + huh);
    System.out.print("Value to find: ");
    int bruh = yo.nextInt();
    for( Integer i: huh )
    {
      if ( bruh == i )
      {
        System.out.println( bruh + " is in the ArrayList.");
      }
    }
  }
}
