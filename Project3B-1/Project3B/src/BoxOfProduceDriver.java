
// Import Classes
import java.util.Random;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;


// Class
public class BoxOfProduceDriver

{

public static void main(String[] args)

{

// Constant
int SIZEOFFRUIT = 5;


// Scanner Object
Scanner scanner = new Scanner(System.in);
Scanner File = null;

// Variables
String fruitInTheList = null;
String[] itemsOnList = new String[SIZEOFFRUIT];


// Try Catch
try

{

File = new Scanner(new FileInputStream(

"items.txt"));

} catch (FileNotFoundException exception)

{

System.out.println("File not found");

System.exit(0);

}


// Loop within the File
int index = 0;

while (File.hasNext())

{

fruitInTheList = File.nextLine();

itemsOnList[index] = fruitInTheList;

index++;

}

// User Choice to enter another Item
String answer = "y";

while (answer.equalsIgnoreCase("y")) {

// Random Object
Random rand =new Random();

// Method to randomly select the items
String TheFristFruit = itemsOnList[rand.nextInt(SIZEOFFRUIT)];

String TheSecondFruit = itemsOnList[rand.nextInt(SIZEOFFRUIT)];

String TheThirdFruit = itemsOnList[rand.nextInt(SIZEOFFRUIT)];

// Object
BoxOfProduce boxOfProduce = new BoxOfProduce(TheFristFruit, TheSecondFruit, TheThirdFruit);


// Input 
System.out.print("Items in Box \n");

System.out.println(boxOfProduce.toString());

System.out.print("List of items:\n");

// Loop to replace items 
for (int i = 0; i < itemsOnList.length; i++)

System.out.println(i + 1 + ": " + itemsOnList[i]);

System.out.println("replace items  with any other item");

System.out.print("Choice between 1-3: ");

int itemReplace = scanner.nextInt();

System.out.print("Select the new choice 1 - 5 ");


// Variable to Switch item
int SwitchWith = scanner.nextInt();

scanner.nextLine();

// Method to Replace Fruit
replaceFruit(boxOfProduce, itemsOnList, TheFristFruit, TheSecondFruit, TheThirdFruit, itemReplace,

		SwitchWith);

System.out.println("Do you want to  more boxOfProduce ? Enter y for Yes or n for No");

answer = scanner.nextLine();

}

scanner.close();

}


// Method to replace item
private static void replaceFruit(BoxOfProduce boxOfProduce, String[] items, String TheFristFruit,

String TheSecondFruit, String  TheThirdFruit, int itemReplace, int SwitchWith) {

// Switch to replace items 
switch (itemReplace) 
{

case 1:

boxOfProduce.setFruitNumberOne(items[SwitchWith - 1]);

break;

case 2:


boxOfProduce.setFruitNumberTwo(items[SwitchWith - 1]);

break;

case 3:

boxOfProduce.setFruitNumberThree(items[SwitchWith - 1]);

break;

default:

System.out.println("Invalid choice");

}

System.out.println("Items:");

System.out.println(boxOfProduce.toString());

}

}

