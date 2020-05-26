package assignment3.ArithmaticOperators;

public class Question7 {

	public static void main(String[] args) {

		
		int acceptAmountOfMachine = 100;
		int itemPrice = 95;
		int changeAmount = acceptAmountOfMachine - itemPrice;
		
		int quarters = changeAmount / 25;
		int remaincent = changeAmount % 25;
		int dimes = remaincent / 10;
		int remaindimes = remaincent % 10;
		int nickles = remaindimes / 5;
		
		System.out.println("Your change is : " + quarters+ " quarters, " + dimes + " dimes, and " + nickles + " nickles" );
		
	
		
		
		
		
		
		
		
		
	}

}
