/* Michael Zulfekar
 * COP 2551
 * 6-17-18
 */

// Call the Scanner Class
import java.util.Scanner;

// Driver Class
public class CreditCardValidator
{
	
	public static void main(String[] args) 
	{
		// Call the Scanner Class
		Scanner scan = new Scanner(System.in);
		
		
		//Input
		System.out.println("Enter a Credit Card Number as a long integer: ");
	    long test = scan.nextLong();
	    
	    // Instantiate a new object from the constructor
	    CreditCard c1 = new CreditCard();
	    
	    // If the card's remainder isn't 0
	    if(c1.isTheCardValid(test) == true) 
	    {
	    	// Output for the cards validity if valid
	    	System.out.println(test + " is Valid");
	    }
	    else 
	    {
	    	// Output for the cards validity if invalid
	    	System.out.println(test + " is not valid ");
	    }


	}
		

}