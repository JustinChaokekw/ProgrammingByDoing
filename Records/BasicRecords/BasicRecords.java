import java.util.*;

class Student
{
  String name;
  int grade;
  double average;
}

public class BasicRecords
{
  public static void main(String[] args)
  {
    Scanner sunflowers = new Scanner(System.in);
    Student fir = new Student();
    Student sec = new Student();
    Student thi = new Student();

    System.out.println("Enter the first student's name: ");
    fir.name = sunflowers.next();
    System.out.println("Enter the first student's grade: ");
    fir.grade = sunflowers.nextInt();
    System.out.println("Enter the first student's average: ");
    fir.average = sunflowers.nextDouble();
    System.out.println("");

    System.out.println("Enter the second student's name: ");
    sec.name = sunflowers.next();
    System.out.println("Enter the second student's grade: ");
    sec.grade = sunflowers.nextInt();
    System.out.println("Enter the second student's average: ");
    sec.average = sunflowers.nextDouble();
    System.out.println("");

    System.out.println("Enter the third student's name: ");
    thi.name = sunflowers.next();
    System.out.println("Enter the third student's grade: ");
    thi.grade = sunflowers.nextInt();
    System.out.println("Enter the third student's average: ");
    thi.average = sunflowers.nextDouble();
    System.out.println("");

    System.out.print("The names are: ");
    System.out.println( fir.name + " " + sec.name + " " + thi.name );


    System.out.print("The grades are: ");
    System.out.println( fir.grade + " " + sec.grade + " " + thi.grade );

    System.out.print("The averages are: ");
    System.out.println( fir.average + " " + sec.average + " " + thi.average );

    System.out.print("The average for the three students is " + (fir.average + sec.average + thi.average)/3 + ".");

  }
}
