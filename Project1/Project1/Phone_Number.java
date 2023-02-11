/* Michael Zulfekar
 * COP 2551 Introduction to OO Programming
 * 5/25/18
 */

import java.util.Random;

public class Phone_Number {

	public static void main(String[] args) {
	
	// Variables
	int	first_digit;
	int second_digit;
	int third_digit;
	int fourth_digit;
	int fifth_digit;
	int sixth_digit;
	int seventh_digit;
	int eighth_digit;
	int ninth_digit;
	int tenth_digit;
	
	// Calling Classes
	Random generator = new Random();
	
	// Calculation
	first_digit= generator.nextInt(7) + 1;
	second_digit= generator.nextInt(7) + 0;
	third_digit= generator.nextInt(7) + 0;
	fourth_digit= generator.nextInt(6) + 0;
	fifth_digit= generator.nextInt(6) + 1;
	sixth_digit= generator.nextInt(6) + 0;
	seventh_digit= generator.nextInt(9) + 0;
	eighth_digit= generator.nextInt(9) + 0;
	ninth_digit= generator.nextInt(9) + 0;
	tenth_digit= generator.nextInt(9) + 0;

	
	//Output
	System.out.println("A random number: " + "" +  first_digit + second_digit + third_digit +
			"-" + fourth_digit + fifth_digit + sixth_digit + "-" +
			"" + seventh_digit + eighth_digit + ninth_digit + tenth_digit);

	}

}


