// Justin Chao. August 31th, 2021.
public class MySchedule
{
  public static void main( String[] args )
  {
    String C1, C2, C3, C4, C5, C6, C7, C8, T1, T2, T3, T4, T5, T6, T7, T8;

    C1 = "Honors Pre-Calculus";
    C2 = "Biology with Lab";
    C3 = "AP Chemistry with Lab";
    C4 = "Musical Production";
    C5 = "Honors English II";
    C6 = "US History";
    C7 = "Honors Expository Writing II";
    C8 = "Java Programming";
    T1 = "Ms. Elaine Liu";
    T2 = "Ms. Sandra Bauer";
    T3 = "Ms. Rina Gillegao";
    T4 = "Ms. Cat Tsai";
    T5 = "Mr. Lee Ciancio";
    T6 = "Mr. Alan Liow";
    T8 = "Ms. Thi Nha Ngo";

    // Quick Reminder:
    // I did not forget to put the teacher of the seventh class as a string,
    // Mr. Ciancio is the teacher of my fifth class and my seventh
    // therefore I only set a string for him.

    System.out.println( "+------------------------------------------------------+" );
    System.out.println( "|No.|Classes                      |Teachers            |" );
    System.out.println( "+------------------------------------------------------+" );
    System.out.println( "|MT1|" + C1 + "          |" + T1 + "      |" );
    System.out.println( "|MT2|" + C2 + "             |" + T2 + "    |" );
    System.out.println( "|MT3|" + C3 + "        |" + T3 + "   |" );
    System.out.println( "|MT4|" + C4 + "           |" + T4 + "        |" );
    System.out.println( "|TF1|" + C5 + "            |" + T5 + "     |" );
    System.out.println( "|TF2|" + C6 + "                   |" + T6 + "       |" );
    System.out.println( "|TF3|" + C7 + " |" + T5 + "     |" );
    System.out.println( "|TF4|" + C8 + "             |" + T8 + "     |" );
    System.out.println( "+------------------------------------------------------+" );
  }
}
