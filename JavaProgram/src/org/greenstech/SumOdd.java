package org.greenstech;


public class SumOdd {
	/*QUESTION 4:
------------
Description: Find the sum of odd number 1 to 100*/

	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=100;i=i+2) {
			System.out.println(i);
			k=k+i;
			System.out.println(k);
		}
		
		System.out.println(k);
	}

}
