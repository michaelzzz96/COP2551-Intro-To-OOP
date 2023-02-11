// Class to test the Exam
public class DriverExamTester
{
	

	public static void main(String[] args) 
	{
		
		// Constant to declare the number of questions
		final int TESTQUESTIONS = 20;
		
		// Array to hold the number of questions
		char [] studentAnswers = new char [TESTQUESTIONS];
		
		// Instantiating the Object
		DriverExam Test1 = new DriverExam( studentAnswers);
		
		// Call the makeMissedArray method.
		DriverExam.makeMissedArray(studentAnswers);
		
		// Call the gradeExam method.
		DriverExam.gradeExam (Test1);
	}

	
}


