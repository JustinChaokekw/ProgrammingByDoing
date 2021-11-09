import java.util.Scanner;

public class WeekdayCalculator
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "Welcome to Justin Chao's fantastic birth-o-meter! (definitely not copied haha!)" );
    System.out.println();
    System.out.println( "All you have to do is enter your birthday, and it will tell you the day of the week on which you were born." );
    System.out.println();
    System.out.println( "Some automatic tests...." );
    System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

    System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

    System.out.println("You were born on " + weekday(mm,dd,yyyy) );
  }

  public static String weekday( int mm, int dd, int yyyy )
  {
    int yy;
    int total = 0;
    String date = "";
    String nww;

    yy = yyyy - 1900;

    if ( is_leap(yyyy) == true && mm == 1)
    {
      total = ( yy / 4 ) + yy + dd + month_offset(mm) - 1;
    }
    else if ( is_leap(yyyy) == true && mm == 2)
    {
      total = ( yy / 4 ) + yy + dd + month_offset(mm) - 1;
    }
    else if ( mm != 1 && mm != 2 )
    {
      total = ( yy / 4 ) + yy + dd + month_offset(mm);
    }
    else if ( is_leap(yyyy) == false )
    {
      total = ( yy / 4 ) + yy + dd + month_offset(mm);
    }

    if ( total % 7 == 1 )
    {
      nww = "Sunday";
    }
    else if ( total % 7 == 2 )
    {
      nww = "Monday";
    }
    else if ( total % 7 == 3 )
    {
      nww = "Tuesday";
    }
    else if ( total % 7 == 4 )
    {
      nww = "Wednesday";
    }
    else if ( total % 7 == 5 )
    {
      nww = "Thursday";
    }
    else if ( total % 7 == 6 )
    {
      nww = "Friday";
    }
    else if ( total % 7 == 0 )
    {
      nww = "Saturday";
    }
    else
    {
      nww = "error";
    }

    date = nww + ", " + month_name(mm) + " " + dd + ", " + yyyy;

    return date;
  }

  public static int month_offset( int mm )
	{
		int mof;

		if(mm == 1)
		{
			mof = 1;
		}
		else if(mm == 2)
		{
			mof = 4;
		}
		else if(mm == 3)
		{
			mof = 4;
		}
		else if(mm == 4)
		{
			mof = 0;
		}
		else if(mm == 5)
		{
			mof = 2;
		}
		else if(mm == 6)
		{
			mof = 5;
		}
		else if(mm == 7)
		{
			mof = 0;
		}
		else if(mm == 8)
		{
			mof = 3;
		}
		else if(mm == 9)
		{
			mof = 6;
		}
		else if(mm == 10)
		{
			mof = 1;
		}
		else if(mm == 11)
		{
			mof = 4;
		}
		else if(mm == 12)
		{
			mof = 6;
		}
		else
		{
			mof = (0-1);
		}

		return mof;
	}

  public static String month_name( int mm )
  {
    String nmm;

    if( mm == 1 )
    {
      nmm = "January";
    }
    else if( mm == 2 )
    {
      nmm = "February";
    }
    else if( mm == 3 )
    {
      nmm = "March";
    }
    else if( mm == 4 )
    {
      nmm = "April";
    }
    else if( mm == 5 )
    {
      nmm = "May";
    }
    else if( mm == 6 )
    {
    nmm = "June";
    }
    else if( mm == 7 )
    {
      nmm = "July";
    }
    else if( mm == 8 )
    {
      nmm = "August";
    }
    else if( mm == 9 )
    {
      nmm = "September";
    }
    else if( mm == 10 )
    {
      nmm = "October";
    }
    else if( mm == 11 )
    {
      nmm = "November";
    }
    else if( mm == 12 )
    {
      nmm = "December";
    }
    else
    {
      nmm = "error";
    }

    return nmm;
  }

  public static boolean is_leap( int yyyy )
	{
		boolean result;

		if ( yyyy%400 == 0 )
			result = true;
		else if ( yyyy%100 == 0 )
			result = false;
		else if ( yyyy%4 == 0 )
			result = true;
		else
			result = false;

		return result;
	}
}
