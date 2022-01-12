import java.util.*;

public class BasicArrayList2
{
  public static void main(String[] args)
  {
    ArrayList<Integer> heh = new ArrayList<Integer>();
    for ( int i = 1 ; i <= 10 ; i++ )
    {
      heh.add(getNumbers());
    }
    System.out.println("ArrayList: " + heh);
  }

  public static int getNumbers()
  {
    Random r = new Random();
    int h = 1 + r.nextInt(100);
    return h;
  }
}
