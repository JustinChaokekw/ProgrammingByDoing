import java.io.*;
import java.util.Scanner;

public class HighScore
{
  public static void main( String[] args ) throws IOException
  {
    Scanner keyboard = new Scanner(System.in);

    int hs;
    String nm;

    System.out.println("You got a high score outta nowhere!");
    System.out.println("");
    System.out.print("Please enter your score: ");
    hs = keyboard.nextInt();
    System.out.print("Please enter your score: ");
    nm = keyboard.next();

    File highscore = new File("score.txt");
    FileWriter fw = new FileWriter(highscore);
    PrintWriter pw = new PrintWriter(fw);
      pw.println( nm + "/" + hs );

    System.out.print("Data stored into score.txt.");
  }
}
