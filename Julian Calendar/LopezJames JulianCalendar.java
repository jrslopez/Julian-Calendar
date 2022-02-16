//CSC330
//Lab 1: Julian Calendar
//James Lopez

package edu.cuny.csi.csc330.lab1;

/**
 * Generates a non-leap year perpetual Julian Calendar 
 * @author lji
 *
 */
public class JulianCalendar { 
	
	// Max number of Days in a month 
	static private  final int MAX_DAY = 31; 
	
	// abbreviated Month names 
	static private  final String [] MONTH_NAMES = {
		"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
	};
	
	// day length of each month 
	static private final  int [] MONTH_SIZES = {
		31, 28, 31,30,31, 30, 31, 31, 30, 31, 30, 31
	};

	/**
	 * display The "DAY" Column Heading 
	 */
	static private void displayDayHeading() {
		System.out.printf("%6s", "Day");
		
	}
	
	/**
	 * display Month names between Day .... Day
	 */
	static private void displayHeading() {
		displayDayHeading(); 
		
		for(int i = 0 ; i < MONTH_NAMES.length ; ++i )  {
			System.out.printf("%5s", MONTH_NAMES[i]);
		}
		
		displayDayHeading(); 
	}
	

	static public void display() {
		displayHeading(); // display heading 

		int x = 1;

		for(int i = 1; i <= 31; i++)
		{
			System.out.printf("%n %5s", x); //displays the 1st day column
			for(int j = 0; j < 12; j++)
			{
				
				// add an if statement to skip listing days for the month
				
				if (i <= MONTH_SIZES[j])
				{
					System.out.printf("  %03d", x);
				}
				else {
					System.out.printf("%5s", " ");
					
				}
				x = x + MONTH_SIZES[j]; //to determine the day number for the next month
			}
			System.out.printf("%5s", i); //displays the 2nd day column
			x = i + 1; //the base number for the day of the month
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// invoke display method 
		JulianCalendar.display(); 
	}
}