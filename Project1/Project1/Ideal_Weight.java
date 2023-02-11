/* Michael Zulfekar
 * COP 2551 Introduction to OO Programming
 * 5/25/18
 */


import java.util.Scanner;

public class Ideal_Weight {

	public static void main(String[] args) {
	
	// Scanner Class
	Scanner scan = new Scanner(System.in);
	
	// Variable Declaration
	int feet_for_men;
	int inches_for_men;
	int feet_for_women;
	int inches_for_women;
	int Men_Weight;
	int Women_Weight;
	int inches_total_women;
	int inches_total_men;
	double Percent = (15.0/100);
	double Range_Men;
	double Range_Women;
	double Range_Men_Lower_Bound;
	double Range_Women_Lower_Bound;
	double Range_Men_Upper_Bound;
	double Range_Women_Upper_Bound;
	final int MEN_IDEAL = 106;
	final int WOMEN_IDEAL = 100;
	
	//User input
	 System.out.print("Enter the Man's height in feet: ");
	 feet_for_men = scan.nextInt();
	 
	 System.out.print("Enter the Man's height in inches: ");
	 inches_for_men = scan.nextInt();
	 
	 System.out.print("Enter the Woman's height in feet: ");
	 feet_for_women = scan.nextInt();
	 
	 System.out.print("Enter the Womens's height in inches: ");
	 inches_for_women = scan.nextInt();
		
	// Calculations for Ideal Weight
	inches_total_women = feet_for_women * 12 + inches_for_women;
	inches_total_men = feet_for_men * 12 + inches_for_men;
	Men_Weight = MEN_IDEAL + (inches_total_men-(5*12))*6;
	Women_Weight = WOMEN_IDEAL+(inches_total_women-(5*12))*5;
	
	// Calculate Range of Ideal Weight
	Range_Men = Men_Weight * Percent;
	Range_Women = Women_Weight * Percent;
	
	// Range for Men and Women
	Range_Men_Lower_Bound = Men_Weight - Range_Men;
	Range_Women_Lower_Bound = Women_Weight - Range_Women;
	Range_Men_Upper_Bound = Men_Weight + Range_Men;
	Range_Women_Upper_Bound = Women_Weight + Range_Women;
	
	// Output
	
	System.out.println("Men weight is: " + Men_Weight + "\n" + "Range for men: " + 
	Range_Men_Lower_Bound + "-" + Range_Men_Upper_Bound);
	
	System.out.println("Women weight is: " + Women_Weight + "\n" + "Range for women: " + 
	Range_Women_Lower_Bound + "-" + Range_Women_Upper_Bound);
	
	}

}
