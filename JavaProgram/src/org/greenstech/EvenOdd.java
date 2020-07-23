package org.greenstech;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter the number to find Even or Odd: ");
		Scanner scanner=new Scanner(System.in);
		long a=scanner.nextLong();
		scanner.close();
		long b=a%2;
		System.out.println("Remainder is: "+b);
		if(b==0) {
			System.out.println("It is a even number");
		}
		else {
			System.out.println("It is a odd number");
		}

	}

}
