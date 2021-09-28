import java.util.Random;

public class FortuneCookie
{
  public static void main( String[] args )
  {
    Random r = new Random();

    int m = r.nextInt(6);
    int n1 = 1 + r.nextInt(54);
    int n2 = 1 + r.nextInt(54);
    int n3 = 1 + r.nextInt(54);
    int n4 = 1 + r.nextInt(54);
    int n5 = 1 + r.nextInt(54);
    int n6 = 1 + r.nextInt(54);

    if ( m == 0 )
    {
      System.out.println( "Fortune cookie says: \"You are stronger than you know.\"" );
    }
    else if ( m == 1 )
    {
      System.out.println( "Fortune cookie says: \"You are the day, you are the night.\"" );
    }
    else if ( m == 2 )
    {
      System.out.println( "Fortune cookie says: \"The darkness you fight is within you.\"" );
    }
    else if ( m == 3 )
    {
      System.out.println( "Fortune cookie says: \"The light you seek is within you.\"" );
    }
    else if ( m == 4 )
    {
      System.out.println( "Fortune cookie says: \"You are not alone.\"" );
    }
    else if ( m == 5 )
    {
      System.out.println( "Fortune cookie says: \"Wake up.\"" );
    }

    System.out.println( n1 + " - " + n2 + " - " + n3 + " - " + n4 + " - " + n5 + " - " + n6 );
  }
}
