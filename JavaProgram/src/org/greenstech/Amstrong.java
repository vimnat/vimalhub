package org.greenstech;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.close();
		int b=a;
		//System.out.println(x);
		int c = 0;
		int d;
		while(a>0) {
			d=a%10;
			System.out.println("d in loop : "+d);
			c=c+(d*d*d);
			System.out.println("c in loop : "+c);
			a=a/10;
		}
		System.out.println("c: "+c);
		System.out.println("b: "+b);
		if(b==c) {
			System.out.println(c+" is Amstrong number");
		}
		else {
			System.out.println(c+ " is not a Amstrong number");
		}

	}

}
