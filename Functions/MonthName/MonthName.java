public class MonthName
{

	public static String month_name( int month )
	{
		String aymonth;

		if( month == 1 )
		{
			aymonth = "January";
		}
		else if( month == 2 )
		{
			aymonth = "February";
		}
		else if( month == 3 )
		{
			aymonth = "March";
		}
		else if( month == 4 )
		{
			aymonth = "April";
		}
		else if( month == 5 )
		{
			aymonth = "May";
		}
		else if( month == 6 )
		{
			aymonth = "June";
		}
		else if( month == 7 )
		{
			aymonth = "July";
		}
		else if( month == 8 )
		{
			aymonth = "August";
		}
		else if( month == 9 )
		{
			aymonth = "September";
		}
		else if( month == 10 )
		{
			aymonth = "October";
		}
		else if( month == 11 )
		{
			aymonth = "November";
		}
		else if( month == 12 )
		{
			aymonth = "December";
		}
		else
		{
			aymonth = "error";
		}

		return aymonth;
	}

	public static void main( String[] args )
	{
		System.out.println( "Month 1: " + month_name( 1 ) );
		System.out.println( "Month 2: " + month_name( 2 ) );
		System.out.println( "Month 3: " + month_name( 3 ) );
		System.out.println( "Month 4: " + month_name( 4 ) );
		System.out.println( "Month 5: " + month_name( 5 ) );
		System.out.println( "Month 6: " + month_name( 6 ) );
		System.out.println( "Month 7: " + month_name( 7 ) );
		System.out.println( "Month 8: " + month_name( 8 ) );
		System.out.println( "Month 9: " + month_name( 9 ) );
		System.out.println( "Month 10: " + month_name( 10 ) );
		System.out.println( "Month 11: " + month_name( 11 ) );
		System.out.println( "Month 12: " + month_name( 12 ) );
		System.out.println( "Month 43: " + month_name( 43 ) );
	}

}
