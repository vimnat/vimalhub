package org.greenstech;

import java.util.Scanner;

public class ScannerEmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id:");
		sc.nextInt();
		
		
		System.out.println("Enter Employee Name:");
		sc.next();
		
		System.out.println("Enter Employee Phone number:");
		sc.nextLong();
		
		System.out.println("Enter Employee Salary:");
		sc.nextFloat();
		
		System.out.println("Enter Employee Gender:");
		sc.next();
		
		System.out.println("Enter Employee City:");
		sc.next();
		sc.close();
		
	}

}
