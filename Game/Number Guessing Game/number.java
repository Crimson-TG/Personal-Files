import java.util.Scanner;
import java.util.Random;
public class number {

	public static void main(String[] args) {
		//Welcome the user
		System.out.println("Hello and welcome to Number Guessing Game!");
		Scanner reader = new Scanner(System.in);
		String repeat;
		
		do {
			//Get the number of the user
			System.out.println("Please enter a number from 1 to 10.");
			int userNumber = reader.nextInt();
			reader.nextLine();
			
			//Make a random number
			Random randInt = new Random();
			int randomizer = randInt.nextInt(10) + 1;
			
			//Compare the user number to the random integer
			if (userNumber == randomizer) {
				System.out.println("Your answer is correct!");
			} else {
				System.out.println("Your answer isn't correct. The correct number is " + randomizer);
			}
			
			System.out.println("Do you want to repeat the process? (yes/no)");
			repeat = reader.nextLine();
		} while (repeat.equalsIgnoreCase("yes"));
		
		System.out.println("See you again next time!");
		reader.close();
	}
}