class BoxOfProduce

{

// Instance Variables
private String FruitNumberOne;

private String FruitNumberTwo;

private String FruitNumberThree;

private static int flyer = 5;

private boolean isFlyer = false;



// Constructor

BoxOfProduce(String FruitNumberOne, String FruitNumberTwo, String FruitNumberThree) {

setFruitNumberOne(FruitNumberOne);

setFruitNumberTwo(FruitNumberTwo);

setFruitNumberThree(FruitNumberThree);

}

// Getter and Setter

public void setFruitNumberOne(String FruitNumberOne) {

this.FruitNumberOne = FruitNumberOne;

setTheRecipeFlyer(FruitNumberOne);

}

public void setFruitNumberTwo(String FruitNumberTwo) {

this.FruitNumberTwo = FruitNumberTwo;

setTheRecipeFlyer(FruitNumberTwo);

}

public void setFruitNumberThree(String FruitNumberThree) {

this.FruitNumberThree = FruitNumberThree;

setTheRecipeFlyer(FruitNumberThree);

}

public String getFruitNumberOne() {

return FruitNumberOne;

}

public String getFruitNumberTwo() {

return FruitNumberTwo;

}

public String getFruitNumberThree() {

return FruitNumberThree;

}



public void setTheRecipeFlyer(String fruit) {

if (fruit.equals("Tomatillo")) {

if (flyer <= 5 && !this.isFlyer) {

this.isFlyer = true;

flyer--;

}

}

System.out.println("Count of the flyer is = " + flyer);

}


public String toString() {

String answer = "";

answer += "1 : " + FruitNumberOne + "\n" + "2 : " + FruitNumberTwo + "\n" + "3 : " + FruitNumberThree;

if (this.isFlyer) {

answer += "\n Salsa Verde Recipe ";

}

return answer;

}

}