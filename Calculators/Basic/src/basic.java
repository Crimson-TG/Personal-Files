import java.util.Scanner;
public class basic {

	public static void main(String[] args) {
		//Welcome the user
		System.out.println("Hello, User. Welcome to basic calculator!");
		
		//Get the 1st integer of the user input
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter your 1st number.");
		double firstNumber = reader.nextDouble();
		
		//Get the 2nd integer of the user input
		System.out.println("Please enter your 2nd number.");
		double secondNumber = reader.nextDouble();
		
		//Choose whether the user wants to sum, subtract, multiply, or divide
		System.out.println("Select A for sum, select S for Subtract, select M for multiply, or select D for divide.");
		char method = reader.next().charAt(0);
		reader.close();
		
		//Define the method and calculate the result
		switch (method) {
			case 'A':
			case 'a':
				System.out.println(firstNumber + secondNumber);
				break;
			case 'S':
			case 's':
				System.out.println(firstNumber - secondNumber);
				break;
			case 'M':
			case 'm':
				System.out.println(firstNumber * secondNumber);
			    break;
			case 'D':
			case 'd':
				System.out.println(firstNumber / secondNumber);
				break;
			default:
				System.out.println("Invalid number!");
		}
	}

}
