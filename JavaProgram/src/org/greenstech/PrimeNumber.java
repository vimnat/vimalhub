package org.greenstech;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to find whether Prime: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.close();
		int b = 0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				b = 4;
			}
		}
		if(b==4) {
			System.out.println("Not a Prime");
		}
		else{
			System.out.println("Prime");
		}
		
	}

}
