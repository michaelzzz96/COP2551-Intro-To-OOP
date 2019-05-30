/*  Michael Zulfekar
 *  6-24-18
 *  COP 2551
 */

	// Calling the Scanner class
	import java.util.Scanner;

	// DriverLicence class
	public class DriverExam 
	{
	
	// Instance Data
	private char [] correct = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 
			'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
	private  char[] student;
	private int Questions = correct.length;
	private int numCorrect = 0;
	private int numIncorrect = 0;
	private int [] missed = new int [Questions];
	private int questionsMissedArrayIndex = 0;
	
	
	// Constructor
	public DriverExam(char [] studentArray)
	{
		student = studentArray;
	}
	
	// Method to grade the exam and count the number of missed questions
	public static void gradeExam(DriverExam Exam ) 
	{
		System.out.println("Correct answers: " + Exam.totalCorrect() + "\n" +
				 "Incorrect answers: " + Exam.totalIncorrect());
		
		// Logic decision if user passes or fails
		if(Exam.passed() ) 
		{
			System.out.println("You passed the exam. ");
		} 
		else 
		{
			System.out.println("You failed the exam. ");
		}
		
		
		System.out.println("You missed the following questions: ");
		// Loop to iterate the number of questions
		for(int i = 0; i < Exam.questionsMissed().length; i++) 
		{
			// Logic decision if user misses N number of questions
			if( Exam.questionsMissed() [i] != 0) 
			{
				System.out.print( Exam.questionsMissed() [i] + " ");
			}
		}
		
	
	}
	
	// Method to Ask the user to enter the questions
	public static void makeMissedArray(char [] studentAnswers) {
		Scanner scan = new Scanner(System.in);
		
		// Input
		System.out.println("Enter your answers to the exam questions. "
				+ "(Make sure Caps Lock is ON!)\n" );
		
		// Loop to iterate the number of questions
		for(int i = 0; i < studentAnswers.length; i++) 
		{
			
			// Input
			System.out.print("Question " + (i + 1 ) + ":" );
	        
			// Local Variable
			char userResponse = scan.next().charAt(0);

			// While loop if user enters another choice
			while (userResponse != 'A' && userResponse != 'B' &&
					userResponse != 'C' && userResponse != 'D') 
			{
				System.out.print("ERROR: Valid answers are A, B, C, or D. \n" + 
			"Question  " + ( i + 1) + ":");
				userResponse = scan.next().charAt(0);
			}
			
			studentAnswers[i] = userResponse;
		}
	}
	
	// Method if the user pass or fails the exam
	public boolean passed() 
	{
		// Local Variables
		int ScoreToPass = 14;
		
		// Logic decision if user passes or fails
		if(totalCorrect() > ScoreToPass ) 
		{
			return true;
		}
		else
			return false;
	}
	
	// Method to count the number of correct answers
	public int totalCorrect() {
		// Local Variables
		int numCorrect = 0;
		
		// Loop to iterate the number of questions
		for(int i = 0; i < Questions; i++ ) {
			
			// Logic decision if correct answers array is equivalent to student array
			if( correct[ i ] == ( student[i] ) ) {
				numCorrect++;
			}
		}
		return numCorrect;
	}
	
	// Method to count the number of incorrect answers
	public int totalIncorrect() {
		// Local Variables
		int numIncorrect = 0;
		
		// Loop to iterate the number of questions
		for(int i = 0; i < Questions; i++ ) {
			// Logic decision if correct answers array is equivalent to student array
			if( !(correct[ i ] == ( student[i] ) ) ) {
				numIncorrect++;
			}
		}
		return numIncorrect;
	}
	
	// Method to count the number of questions missed
	public int [] questionsMissed() {
		// Local Variables
		int [] questionsMissedArray = new int [Questions];
		int questionsMissedIndex = 0;
				
		// Loop to iterate the number of questions
		for(int i = 0; i < Questions; i++ ) {
			// Logic decision if correct answers array is equivalent to student array
			if( !(correct[ i ] == ( student[i]) ) ) {
				questionsMissedArray[ questionsMissedIndex ] = i + 1;
				questionsMissedIndex++;
			}
		}
		
		return questionsMissedArray;
		
	}

	
}
