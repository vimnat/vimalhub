package org.greenstech;

public class CountEven {
	
	/*QUESTION 5:
-----------
Description: Count of even number 1 to 100*/

	public static void main(String[] args) {
		int k=0;
		for(int i=2;i<=100;i=i+2) {
			//System.out.println(i);
			k++;
			//System.out.println(k);
		}
		System.out.println("Count of even number from 1 to 100: "+k);
	}



}
