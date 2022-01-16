import java.util.*;

class stu
{
  String n;
  int g;
  double a;
}

public class ALittleDatabase
{
  public static void main(String[] args)
  {
    Scanner sunflowers = new Scanner(System.in);
    stu f = new stu();
    stu s = new stu();
    stu t = new stu();

    System.out.println("Enter student 1's name: ");
    f.n = sunflowers.next();
    System.out.println("Enter student 1's grade: ");
    f.g = sunflowers.nextInt();
    System.out.println("Enter student 1's average: ");
    f.a = sunflowers.nextDouble();
    System.out.println("");

    System.out.println("Enter student 2's name: ");
    s.n = sunflowers.next();
    System.out.println("Enter student 2's grade: ");
    s.g = sunflowers.nextInt();
    System.out.println("Enter student 2's average: ");
    s.a = sunflowers.nextDouble();
    System.out.println("");

    System.out.println("Enter student 3's name: ");
    t.n = sunflowers.next();
    System.out.println("Enter student 3's grade: ");
    t.g = sunflowers.nextInt();
    System.out.println("Enter student 3's average: ");
    t.a = sunflowers.nextDouble();
    System.out.println("");

    System.out.print("The names are: ");
    System.out.println( f.n + " " + s.n + " " + t.n );


    System.out.print("The grades are: ");
    System.out.println( f.g + " " + s.g + " " + t.g );

    System.out.print("The averages are: ");
    System.out.println( f.a + " " + s.a + " " + t.a );

    System.out.print("The average for the three students is " + (f.a + s.a + t.a)/3 + ".");

  }
}
