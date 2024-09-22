import java.util.Scanner; //Import a scanner for user input

public class hypotenuse {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//Get the value for the perpendicular
		System.out.println("Enter a number for the perpendicular.");
        double perpendicular = reader.nextDouble();
        //Get the value for the base
        System.out.println("Enter a number for the base.");
        double base = reader.nextDouble();
        reader.close();  
        //Solving for the hypotenuse
        double squareAndSum = (perpendicular * perpendicular) + (base * base);
        //Get the square root
        double result = Math.sqrt(squareAndSum);
        //Print the result
        System.out.println("The value of the hypotenuse is: " + result);
	}
}