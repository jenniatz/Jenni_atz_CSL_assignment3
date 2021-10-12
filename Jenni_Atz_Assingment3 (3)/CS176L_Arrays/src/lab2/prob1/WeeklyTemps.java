/**
 * @author j.atz
 */

package lab2.prob1;

public class WeeklyTemps {
	//data 
	// one way: private double [] weeklyTemps = new double [7];
	
	private double [] weeklyTemps;
	
	//private double [] weeklyTemps = new double [7];
	
	
	
	//default constructor
	public WeeklyTemps() {
		weeklyTemps = new double [7];
		
		double [] temps = {78.4, 68.1, 80, 85, 82.9, 79.8, 60};
		
		
		// memory reference
		
		weeklyTemps = temps;
		
	}		
	
	
	
	
	// methods: 
	/**
	 * Get maximum temp for the week
	 * @return maxTemp
	 */
	
	//double maxTemp = weeklyTemps[0];
	public double getMax() {
		double maxTemp = weeklyTemps[0];
		 
		
		for ( int i = 1; i < weeklyTemps.length; i++) {
			 maxTemp = weeklyTemps[0];
			if (weeklyTemps[i] > maxTemp) {
				maxTemp = weeklyTemps[i];
			}
			
		}
	
	return maxTemp;	
	}
	
	/**
	 * 
	 * get min temp for week
	 * @return maxTemp
	 */
	//double minTemp = weeklyTemps[0];
	
	public double getMin() {
		double minTemp = weeklyTemps[0];
		
		for ( int i = 1; i < weeklyTemps.length; i++) {
			  minTemp = weeklyTemps[0];
			if (weeklyTemps[i] < minTemp) {
				minTemp = weeklyTemps[i];
			}
			
		}
		return minTemp;	
	}
	//return minTemp;	
//}	
	
	
	/**
	 * return the range of temps (min to max) as a string
	 * @return tempRange
	 */
	
	double range = 0;
	public String getRangeStr() {
			
			
			
			
			String output = String.format ("%1d - %1d ", minTemp, maxTemp);
			return output;	
			
			
		}
		
		
		
	// string.format = 
	// String output = String.format = ("%s = %d" , "joe", 35);
	// System.out.println(output)
	// prints->  joe = 35;
		//%1f for 1 decimal place 
		//
		
		
		/**
		 * return the mean temp 
		 * @retun meantemp
		 * method # 4 getMeanTemp
		 */
		double total = 0;
		double average =  0;
	public double getMean() {
			
			for ( int i = 1; i < weeklyTemps.length; i++) {
				
				total = total + weeklyTemps[i];
				
				average = total/ weeklyTemps.length;
			}
			return average;		
			
		
		}		
		
	
	/**
	 * return the number of extreme days
	 * @ return extremeDays
	 * method #5 getExtreme
	 */

	//double extremeDays = 0;
public double getExtremeDays() {
	double extremeDays = 0;
	for ( int i = 1; i < weeklyTemps.length; i++) {
		
		if (weeklyTemps[i] <= 5 ) {
			
			 extremeDays = i;
		}
			if (weeklyTemps[i] >= 95) 
			{
		 
			
				extremeDays = i;	 
					
			}
					}
	
			return extremeDays;
		}	


}









		
