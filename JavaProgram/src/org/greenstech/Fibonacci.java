package org.greenstech;

public class Fibonacci {

	public static void main(String[] args) {
		long a=0l;
		long b=1l;
		long c;
		for(long i=0;i<=100;i++) {
			//System.out.println(i);
			
			System.out.print(a+",");
			c=a+b;
			a=b;
			b=c;
			
		}
	
	}

}
