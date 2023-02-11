/* Michael Zulfekar
 * COP 2551
 * 6-17-18
 */

// Import Scanner Class
import java.util.Scanner;

public class Vowel
{
	public static void main(String[] args) 
	{
		// Call Scanner Class
		Scanner scan = new Scanner (System.in);
		
		// String Variable 
		String word;
		
		//Input
		System.out.print("Enter a Word: ");
		word = scan.nextLine();
		
		// Variables for the number of vowels of the String
		int Number_of_a = 0;
		int Number_of_e = 0;
		int Number_of_i = 0;
		int Number_of_o = 0;
		int Number_of_u = 0;
		int other = 0;
		
		// For loop to count/iterate the index of the String
		for(int index = 0; index < word.length(); index++) 
		{
			
			 // Locates the number of a's
			 if (word.charAt(index) == 'a') 
			 {
				 Number_of_a++;
			 }
			 // Locates the number of e's
			 else if (word.charAt(index) == 'e') 
			 {
				 Number_of_e++;
			 }
			 // Locates the number of i's
			 else if (word.charAt(index) == 'i')
			 {
				 Number_of_i++;
			 }
			 // Locates the number of o's
			 else if (word.charAt(index) == 'o')
			 {
				 Number_of_o++;
			 }
			 // Locates the number of u's
			 else if (word.charAt(index) == 'u')
			 {
				 Number_of_u++;
			 }
			 // Locates the number of non vowels
			 else if ('a' != word.charAt(index) && 'e' != word.charAt(index) && 'i' != word.charAt(index) 
					 && 'o' != word.charAt(index) && 'u' != word.charAt(index))
			 {
				 other = other + 1;
			 }
			 
		}
		
		// Output
		System.out.println("There are " + Number_of_a + " a's ");
		System.out.println("There are " + Number_of_e + " e's ");
		System.out.println("There are " + Number_of_i + " i's ");
		System.out.println("There are " + Number_of_o + " o's ");
		System.out.println("There are " + Number_of_u + " u's ");
		System.out.println("There are " + other + " Non Vowels ");
		
	}
}
