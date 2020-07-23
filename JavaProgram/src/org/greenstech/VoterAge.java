package org.greenstech;

import java.util.Scanner;

public class VoterAge {

	/*QUESTION 1:
		-----------
		Description: Write Java program to allow the user to input his/her age.     
		             Then the program will show if the person is eligible to vote.
		             A person who is eligible to vote must be older than or equal 1 to 18 years old.*/
	
	public static void main(String[] args) {
		System.out.println("Enter age to check the eligibility to vote:  ");
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		scanner.close();
		if(age<18) {
			System.out.println("Your age "+age+" is not eligible to Vote");
		}
		else {
			System.out.println("Your age " +age+" is eligible to vote");
		}
	}
}
