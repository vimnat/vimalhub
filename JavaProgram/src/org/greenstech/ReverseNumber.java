package org.greenstech;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to be reversed: ");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int c=sc.nextInt();
		sc.close();
		for(int i=a.length()-1;i>=0;i--) {
			
			char b = a.charAt(i);
			System.out.print(b);
		}

	}

}
