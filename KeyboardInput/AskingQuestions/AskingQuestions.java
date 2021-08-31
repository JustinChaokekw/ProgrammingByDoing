import java.util.Scanner;

public class AskingQuestions
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    int age, heightF, heightI;
    double weight;

    System.out.print( "How old are you?" );
    age = keyboard.nextInt();

    System.out.print( "How many feet tall are you?" );
    heightF = keyboard.nextInt();

    System.out.print( "And how many inches?" );
    heightI = keyboard.nextInt();

    System.out.print( "How much do you weigh in pounds?" );
    weight = keyboard.nextDouble();

    System.out.println( "So you are " + age + " years old, " + heightF + "'" + heightI + " tall and " + weight + " pounds heavy." );
  }
}
