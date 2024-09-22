// The currency is based on August 2024

/* This is a personal project for my own learning
 * to further enhance my understanding on java 
 * conditionals, data types, and my logical 
 * thinking. */

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Welcome to currency converter. What's your name? "); // Welcome the user and get their name
		String userName;
		userName = scan.nextLine();
		
		System.out.println("Hello, " + userName + ". We only accept a USD, JPY, GBP, and PHP to convert."); // print the user name and tell the user the currency that can convert of this calculator
		System.out.println("What would you like to convert? (enter 1 if USD, enter 2 if JPY, enter 3 if GBP, and enter 4 if PHP)"); // Ask the user what to choose
		int firstUserInput = 0;
		firstUserInput = scan.nextInt();
		
		// Variable for the user input of their amount of money in that currency for converting it to another currency
		int userInputUSD = 0, userInputJPY = 0, userInputGBP = 0, userInputPHP = 0;
		
		// Process the first user input in this conditions
		if (firstUserInput == 1) {
			System.out.print("You've selected USD, where would you like to convert it into? (Enter 2 if JPY, enter 3 if GBP, and enter 4 if PHP)");
			userInputUSD = scan.nextInt();
		} else if (firstUserInput == 2) {
			System.out.print("You've selected JPY, where would you like to convert it into? (Enter 1 if USD, enter 3 if GBP, and enter 4 if PHP)");
			userInputJPY = scan.nextInt();
		} else if (firstUserInput == 3) {
			System.out.print("You've selected GBP, where would you like to convert it into? (Enter 1 if USD, enter 2 if JPY, and enter 4 if PHP)");
			userInputGBP = scan.nextInt();
		} else if (firstUserInput == 4) {
			System.out.print("You've selected PHP, where would you like to convert it into? (Enter 1 if USD, enter 2 if JPY, and enter 3 if GBP)");
			userInputPHP = scan.nextInt();
		} else {
			System.out.println("You've selected a wrong number. Please try again.");
		}
		
		// Variable for the user money amount and converted user money
		double userMoney = 0, userMoneyConverted = 0;
			
		// Process if the user wants to convert their USD to their specified currency
		if (userInputUSD == 1) {
			System.out.println("It seems that you are trying to convert USD to USD. Please try again.");
		} else if (userInputUSD == 2) {
			// USD to JPY
			System.out.println("You've selected JPY. We will going to convert your USD to JPY.");
			System.out.print("Please enter the USD amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 147.31; // Convert
			
			// Print the converted money
			System.out.println("The converted amount is " + userMoneyConverted + " JPY.");
		} else if (userInputUSD == 3) {
			// USD to GBP
			System.out.println("You've selected GBP. We will going to convert your USD to GBP.");
			System.out.print("Please enter the USD amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 0.78; // Convert
			
			// Print the converted money
			System.out.println("The converted amount is " + userMoneyConverted + " GBP.");
		} else if (userInputUSD == 4) {
			// USD to PHP
			System.out.println("You've selected PHP. We will going to convert your USD to PHP");
			System.out.print("Please enter the USD amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 56.93; // Convert
			
			// Print the converted money
			System.out.println("The converted amount is " + userMoneyConverted + " PHP.");
		}
		
		// Process if the user wants to convert their JPY to their specified currency
		else if (userInputJPY == 1) {
			// JPY to USD			System.out.println("You've selected USD. We will going to convert your JPY to USD.");
			System.out.print("Please enter the JPY amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 0.0068; // Convert
			
			// Print the converted money
			System.out.println("The converted amount is " + userMoneyConverted + " USD.");
		} else if (userInputJPY == 2) {
			System.out.println("It seems that you are trying to convert JPY to JPY. Please try again.");
		} else if (userInputJPY == 3) {
			// JPY to GBP
			System.out.println("You've selected GBP. We will going to convert your JPY to GBP.");
			System.out.print("Please enter the JPY amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 0.0053; // Convert
			
			// Print the converted amount
			System.out.println("The converted amount is " + userMoneyConverted + " GBP.");
		} else if (userInputJPY == 4) {
			// JPY to PHP
			System.out.println("You've selected PHP. We will going to convert your JPY to PHP.");
			System.out.print("Please enter the JPY amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 0.29; // Convert
			
			// Print the converted amount
			System.out.println("The converted amount is " + userMoneyConverted + " PHP.");
		}
		
		// Process if the user wants to convert their GBP to their specified currency
		else if (userInputGBP == 1) {
			// GBP to USD
			System.out.println("You've selected USD. We will going to convert your GBP to USD.");
			System.out.print("Please enter the GBP amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 1.28; // Convert
			
			// Print the converted amount
			System.out.println("The converted amount is " + userMoneyConverted + " USD.");
		} else if (userInputGBP == 2) {
			// GBP to JPY
			System.out.println("You've selected JPY. We will going to convert your GBP to JPY.");
			System.out.print("Please enter the GBP amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 188.83; // Convert
			
			// Print the converted amount
			System.out.println("The converted amount is " + userMoneyConverted + " JPY.");
		} else if (userInputGBP == 3) {
			System.out.println("It seems that you are trying to convert GBP to GBP. Please try again.");
		} else if (userInputGBP == 4) {
			// GBP to PHP
			System.out.println("You've selected PHP. We will going to convert your GBP to PHP.");
			System.out.print("Please enter the GBP amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 73.21; // Convert
			
			// Print the converted amount
			System.out.println("The converted amount is " + userMoneyConverted + " PHP.");
		}
		
		// Process if the user wants to convert their PHP to their specified currency
		else if (userInputPHP == 1) {
			// PHP to USD
			System.out.println("You've selected USD. We will going to convert your PHP to USD.");
			System.out.print("Please enter the PHP amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 0.018; // Convert
			
			// Print the converted amount
			System.out.println("The converted amount is " + userMoneyConverted + " USD.");
		} else if (userInputPHP == 2) {
			// PHP to JPY
			System.out.println("You've selected JPY. We will going to convert your PHP to JPY.");
			System.out.print("Please enter the PHP amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 2.58; // Convert
			
			// Print the converted amount
			System.out.println("The converted amount is " + userMoneyConverted + " JPY");
		} else if (userInputPHP == 3) {
			// PHP to GBP
			System.out.println("You've selected GBP. We will going to convert your PHP to GBP.");
			System.out.print("Please enter the PHP amount: ");
			userMoney = scan.nextDouble();
			userMoneyConverted = userMoney * 0.014; // Convert
			
			// Print the converted amount
			System.out.println("The converted amount is " + userMoneyConverted + " GBP.");
		} else if (userInputPHP == 4) {
			System.out.println("It seems that you are trying to convert PHP to PHP. Please try again later.");
		} else {
			System.out.println("You've selected a wrong number. Please try again.");
		}
		
		scan.close(); // Close the scanner
		
	}

}
