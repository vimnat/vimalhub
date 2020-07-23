package org.greenstech;

import java.util.Scanner;

public class ScannerStud {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id: ");
		sc.nextInt();
		
		System.out.println("enter student Name: ");
		sc.next();
		
		System.out.println("enter student Mark1: ");
		float m1=sc.nextFloat();
		System.out.println("enter student Mark2: ");
		float m2=sc.nextFloat();
		System.out.println("enter student Mark3: ");
		float m3=sc.nextFloat();
		System.out.println("enter student Mark4: ");
		float m4=sc.nextFloat();
		System.out.println("enter student Mark5: ");
		float m5=sc.nextFloat();
		
		float sum = m1+m2+m3+m4+m5;
		System.out.println("total marks: "+ sum);
		
		float avg = sum/5;
		System.out.println("Average is: "+avg);
				
	}

}
