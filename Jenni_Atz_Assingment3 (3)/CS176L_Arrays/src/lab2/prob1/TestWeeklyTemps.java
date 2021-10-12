/**
 * test the weekly temps class.
 */

package lab2.prob1;

public class TestWeeklyTemps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeeklyTemps lastWeek = new WeeklyTemps();
	
		System.out.println("Weekly Temperature data (degreed F) : ");
		
		
		/**
		 * print the mean temp of last week 
		 */
		System.out.println ( " Mean : " + "\t" );
		lastWeek.getMean();

				
		/**
		 * print the range temp of last week
		 */
		
		System.out.println ( " range: " + "\t" );
		lastWeek.getRangeStr();
		
		
				

		/**
		 * print the number of extreme temp days of last week
		 */
		System.out.println ( " extreme temp days: " + "\t" );
		lastWeek.getExtremeDays();
		
	}
	

}
