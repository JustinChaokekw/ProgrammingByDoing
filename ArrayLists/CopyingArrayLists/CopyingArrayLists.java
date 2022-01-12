import java.util.*;

public class CopyingArrayLists
{
  public static int getNumbers()
  {
    Random r = new Random();
    int h = 1 + r.nextInt(100);
    return h;
  }

  public static void main(String[] args)
  {
    ArrayList<Integer> hehe = new ArrayList<Integer>();
    ArrayList<Integer> haha = new ArrayList<Integer>();
    for ( int i = 1; i <= 10 ; i++ )
    {
      hehe.add(getNumbers());
    }
    haha.addAll(hehe);
    hehe.set(hehe.size()-1, -7);
    System.out.println("ArrayList 1: " + hehe);
    System.out.println("ArrayList 2: " + haha);
  }
}
