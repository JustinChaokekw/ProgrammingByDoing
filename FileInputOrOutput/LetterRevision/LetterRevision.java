import java.io.*;

public class LetterRevision
{
  public static void main( String[] args ) throws IOException
  {
    File letter = new File("letter.txt");
    FileWriter fw = new FileWriter(letter);
    PrintWriter pw = new PrintWriter(fw);
      pw.println( "+--------------------------------------------------+" );
      pw.println( "|                                              ####|" );
      pw.println( "|                                              ####|" );
      pw.println( "|                                              ####|" );
      pw.println( "|                                                  |" );
      pw.println( "|                                                  |" );
      pw.println( "|                Justin Chao                       |" );
      pw.println( "|                No. 72, Beida Rd.                 |" );
      pw.println( "|                Hsinchu City, 30044               |" );
      pw.println( "|                                                  |" );
      pw.println( "+--------------------------------------------------+" );
      pw.close();
  }
}
