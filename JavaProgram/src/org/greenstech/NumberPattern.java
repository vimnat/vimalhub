package org.greenstech;

public class NumberPattern {

	public static void main(String[] args) {

		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}
		
		for(int k=1;k<=7;k++) {
			for(int h=1;h<=k;h++) {
				
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println("");
		}
		
																								

	}

}
