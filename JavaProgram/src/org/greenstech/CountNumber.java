package org.greenstech;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		sc.close();
		int k=0;
		for(int i=a.length()-1;i>=0;i--) {
			k++;
		}
		System.out.println("count of number is: "+k);
		

	}

}
