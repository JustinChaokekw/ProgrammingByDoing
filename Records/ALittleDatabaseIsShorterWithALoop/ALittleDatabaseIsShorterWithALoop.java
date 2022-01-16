import java.util.*;

class st
{
  String n;
  int g;
  double a;
}

public class ALittleDatabaseIsShorterWithALoop
{
  public static void main(String[] args)
  {
    Scanner k = new Scanner(System.in);
    st sdsbsdsb[] = new st[3];

    for( int i = 0 ; i < sdsbsdsb.length ; i++ )
    {
      sdsbsdsb[i] = new st();
      System.out.print("Enter student " + (i+1) + "'s name: ");
      sdsbsdsb[i].n = k.next();
      System.out.print("Enter student " + (i+1) + "'s grade: ");
      sdsbsdsb[i].g = k.nextInt();
      System.out.print("Enter student " + (i+1) + "'s average: ");
      sdsbsdsb[i].a = k.nextDouble();
      System.out.println();
    }

    System.out.println("The names are: " + sdsbsdsb[0].n + " " + sdsbsdsb[1].n + " " + sdsbsdsb[2].n);
    System.out.println("The grades are: " + sdsbsdsb[0].g + " " + sdsbsdsb[1].g + " " + sdsbsdsb[2].g);
    System.out.println("The averages are: " + sdsbsdsb[0].a + " " + sdsbsdsb[1].a + " " + sdsbsdsb[2].a);
  }
}
