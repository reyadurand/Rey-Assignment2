package com.coderscampus;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 100) + 1;
	        int chances = 5;
	        Scanner scanner = new Scanner(System.in);


	        while (chances > 0) {
	            System.out.print("Please pick a number between 1 and 100.");
	            int guess = scanner.nextInt();

	            if (guess < 1 || guess > 100) {
	                System.out.println("Your guess is not between 1 and 100, please try again.");
	                continue;
	            }

	            if (guess == randomNumber) {
	                System.out.println("You win!");
	                break;
	            } else if (guess < randomNumber) {
	                System.out.println("Please pick a higher number.");
	            } else {
	                System.out.println("Please pick a lower number.");
	            } 
	            
	            
	            chances--;
	            System.out.println("Chances remaining: " + chances);
	        }

	        if (chances == 0) {
	        	System.out.println("You lose!");
	            System.out.println("The number to guess was: " + randomNumber);
	        }

	        scanner.close();
	    }
	}