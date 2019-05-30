/* Michael Zulfekar
 * COP 2551 Introduction to OO Programming
 * 5/25/18
 */

import java.util.Scanner;
public class Paint
{
    public static void main(String[] args)
    {
   final int COVERAGE = 350;  //paint covers 350 sq ft/gal
   //declare integers length, width, and height;
   int length;
   int width;
   int height;
   int door = 20;
   int window = 15;
   // declare integers numDoors and numWindows
   int numDoors;
   int numWindows;
   //declare double totalSqFt;
   double totalSqFt;
   double OthertotalSqFt;
   //declare double paintNeeded;
   double paintNeeded;
   // Scanner Class
   Scanner scan = new Scanner(System.in);
   //Prompt for and read in the length of the room
   System.out.print("Enter the length of the room: ");
   length = scan.nextInt();
   //Prompt for and read in the width of the room
   System.out.print("Enter the width of the room: ");
   width = scan.nextInt();
   //Prompt for and read in the height of the room
   System.out.print("Enter the heigth of the room: ");
   height = scan.nextInt();
   // Prompt for and read in the number of doors and windows
   System.out.print("Enter the number of doors: ");
   numDoors = scan.nextInt();
   System.out.print("Enter the number of windows: ");
   numWindows = scan.nextInt();
   System.out.println();
   //Compute the total square feet to be painted--think
   //about the dimensions of each wall. Subtract off the area of the windows and doors
   totalSqFt =  (width * height * 2) + (2 * height * length) - (numDoors * door - numWindows - window);
   //Compute the amount of paint needed
   paintNeeded = totalSqFt/COVERAGE;
   //Print the length, width, and height of the room and the
   //number of gallons of paint needed.
   System.out.println("Length: " + length); 
   System.out.println("Width: " + width);
   System.out.println("Heigth: " + height);
   System.out.println("Number of gallons: " + paintNeeded);
   
   }
}