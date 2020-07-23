package org.greenstech;

import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.close();
		//System.out.println(x);
		int c = 0;
		int d;
		while(a>0) {
			d=a%10;
			System.out.println("d in loop : "+d);
			c=c+d;
			System.out.println("c in loop : "+c);
			a=a/10;
		}
		System.out.println("c: "+c);

	}

}
