import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LongNonDecrease nonDecrease = new LongNonDecrease();
		Scanner myObj = new Scanner(System.in);
		int runAgain=1;
		int userInput;
		int numInput;
	
	
		
		while (runAgain == 1){
			
			
			//asks user what they want to do
			System.out.println("\n \n \nWhat would you like to do? \n"
					+ "Please enter: \n1 if you want to print the entire sequence \n"
					+ "2 if you want to print the longest non decreasing sequence \n"
					+ "3 if you want to add more numbers to the sequence \n"
					+ "4 if you want to reset the numbers in the sequence \n"
					+ "5 if you want to end the program");
		
			userInput = myObj.nextInt();
			
	
			
	
			
			switch (userInput) {
				//prints entire sequence
				case 1: userInput = 1;
					nonDecrease.printEntire();
					runAgain=1;
					break; 
				
				//creates and prints longest non decreasing sequence	
				case 2: userInput = 2;
						System.out.println("Printing results using 1D Arrays: ");
						nonDecrease.printNonDecrease();
						System.out.println("\n \n \nPrinting results using 2D Arrays: ");
						nonDecrease.printNonDecreaseMulti();
						break;
				
				
				//adds numbers to the array
				case 3: userInput = 3;
					System.out.println("How many numbers would you like to add?");
					numInput = myObj.nextInt();
					nonDecrease.setArrayNum(numInput);
					runAgain=1;
					break;
					
				//deletes all the numbers 	
				case 4: userInput = 4;
					nonDecrease.resetArray();
					runAgain=1;
					break;
				
				//ends program
				case 5: userInput = 5;
					System.out.println("The program is ending.");
					runAgain=2;
					break;
				
				default:
					System.out.println("Invalid input.");
					runAgain=1;
					break;
					
			}//end of switch statement
			
			

			
		
		
		}//end of while loop
		
		
		
		
		
		
	}

}
