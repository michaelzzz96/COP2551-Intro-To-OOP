/* Michael Zulfekar
 * COP 2551 Introduction to OO Programming
 * 5/25/18
 */

import java.util.Scanner;
import java.util.Random;

public class Name{

	public static void main(String[] args) {
	
	// Variable Declaration
	String first_name;
	String last_name;
	String last_name_mutation;
	int num1;
	
	// Calling Classes
	Random generator = new Random();
	Scanner myscan = new Scanner(System.in);
	
	// User Input
	System.out.print("Enter your first name: ");
	String name1 = myscan.next(); 
	
	System.out.print("Enter your last name: ");
	String name2 = myscan.next(); 
	
	// Random Calculation
	char firstLetter = name1.charAt(0);
	num1 = generator.nextInt(100);
	last_name_mutation = name2.substring(0,5);
	
	
	// Output
	System.out.println("Username:" + firstLetter + last_name_mutation + num1);
	

	}

}

