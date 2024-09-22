import java.util.Scanner;

public class DisTimeSpeed {
    public static void main(String[] args) {
		//Welcome the user
        System.out.println("Welcome to Force and Motion calculator!");
		System.out.println("Here you can calculate Distance, Time, and Speed.");
		
		//Make the user select a method or formula
		System.out.println("Please select D for calculating distance, T for time, and S for speed.");
		
		Scanner userInput = new Scanner(System.in); //Make a scanner
		
		char method = userInput.next().charAt(0); //Identify the user input
		
		switch (method) {
			case 'D':
			case 'd':
				//Solving Distance
				System.out.println("It seems that you are looking for the distance. Take note that this calculator only calculate meter unit.");
				System.out.println("Please enter the Time value in second/s.");
				double disTime = userInput.nextDouble();
				System.out.println("Please enter the Speed value in meter/s per second.");
				double disSpeed = userInput.nextDouble();
				System.out.println("The answer is: " + (disSpeed * disTime) + " meter/s or " + Math.round(disSpeed * disTime) + " meter/s");
				break;
			case 'T':
			case 't':
				//Solving Time
				System.out.println("It seems that you are looking for the Time it would take. Take note that this calculator only calculate second/s unit.");
				System.out.println("Please enter the Distance value in meter/s.");
				double tiDistance = userInput.nextDouble();
				System.out.println("Please enter the Speed value in meter/s per second");
				double tiSpeed = userInput.nextDouble();
				System.out.println("The answer is: " + (tiDistance / tiSpeed) + " second/s or " + Math.round(tiDistance / tiSpeed) + " second/s");
				break;
			case 'S':
			case 's':
				//Solving Speed
				System.out.println("It seems that you are looking for the speed it takes. Take note that this calculator only calculate in second/s");
				System.out.println("Please enter the Distance value in meter/s");
				double spDistance = userInput.nextDouble();
				System.out.println("Please enter the Time value in second/s");
				double spTime = userInput.nextDouble();
				System.out.println("The answer is: " + (spDistance / spTime) + " m/s or " + Math.round(spDistance / spTime) + "m/s");
				break;
			default:
				System.out.println("Invalid input.");
		}
    }
}