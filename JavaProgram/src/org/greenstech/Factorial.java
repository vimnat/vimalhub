package org.greenstech;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number to find Factorial: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.close();
		long b=1l;
		for (int i=a;i>0;i--) {
			System.out.println(i);
			b=b*i;
		}
		System.out.println("Factorial of number "+a+" is "+b);
	

	}

}
