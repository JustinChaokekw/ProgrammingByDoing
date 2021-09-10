import java.util.Scanner;

public class TwoMoreQuestions
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    String A1, A2;

    System.out.println("TWO MORE QUESTIONS, BABY!");
    System.out.println();
    System.out.println("Think of something and I'll try to guess it!");
    System.out.println();
    System.out.println("Question 1) Does it stay inside or outside or both?");
    System.out.println("(inside/outside/both)");
    A1 = keyboard.next();

    System.out.println("Question 2) Is it a living thing? ");
    System.out.println("(yes/no)");
    A2 = keyboard.next();

    if (A1.equals("inside") && A2.equals("yes"))
    {
      System.out.println();
      System.out.println("Well, I guess it might be a pet cat, however, I care not about the answer.");
    }

    if (A1.equals("inside") && A2.equals("no"))
    {
      System.out.println();
      System.out.println("Emm, I think a sofa might be a decent guess, since- yeah, I'm too lazy to continue asking.");
    }

    if (A1.equals("outside") && A2.equals("yes"))
    {
      System.out.println();
      System.out.println("What about the tree in the park? Sounds correct? Anyways., I'll end it here.");
    }

    if (A1.equals("outside") && A2.equals("yes"))
    {
      System.out.println();
      System.out.println("Hmmm...let's say you're thinking about the rock on the side of the road. That's it.");
    }

    if (A1.equals("both") && A2.equals("yes"))
    {
      System.out.println();
      System.out.println("Heh, YOU.");
    }

    if (A1.equals("both") && A2.equals("no"))
    {
      System.out.println();
      System.out.println("Probably a laptop? Ok, that's the answer, no objection allowed.");
    }

  }
}
