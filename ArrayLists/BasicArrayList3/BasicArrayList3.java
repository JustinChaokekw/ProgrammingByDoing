import java.util.*;

public class BasicArrayList3
{
  public static void main(String[] args)
  {
    printArray(1000);
  }

  static void printArray(int size)
  {
    ArrayList<Integer> huh = new ArrayList<Integer>();

    for ( int i = 0 ; i < size ; i++ )
    {
      huh.add(getNumbers());
    }
    System.out.print("Array List: " + huh + "\t");
  }

  static int getNumbers()
  {
    Random r = new Random();
    int t = r.nextInt(90) + 10;
    return t;
  }
}
