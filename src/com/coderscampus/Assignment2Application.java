package com.coderscampus;

import java.util.Random;
import java.util.Scanner;


public class Assignment2Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random pickAnumber = new Random();
		
		int theAnswer = pickAnumber.nextInt(100) + 1;
		int triesSofar = 0;
		
		
		System.out.println("Please pick a number between 1 and 100.");
		
		while (triesSofar < 5) {
		
int yourGuess = scanner.nextInt();
	triesSofar++;
	
		if (yourGuess < 1 || yourGuess > 100) {
			System.out.println("Your number is not between 1 and 100, please try again");
			triesSofar--;
		}
		
		else if (yourGuess < theAnswer & triesSofar < 5) {
			System.out.println("Please pick a higher number.");
			
		} 
		 	else if (yourGuess > theAnswer & triesSofar < 5) {
			
		 		System.out.println("Please pick a lower number.");
		} 
		 	else if (yourGuess == theAnswer){
			
		 		System.out.println("You Won! The number was " + theAnswer + "! All smart and stuff.");
		 			
			break;
		}
		
		if (yourGuess != theAnswer && triesSofar > 4) {
			System.out.println("Sorry, you lost. The number I was thinking of was " + theAnswer +".");
		}
		}		
	
		scanner.close();	
	}

}
