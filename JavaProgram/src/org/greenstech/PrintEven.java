package org.greenstech;

public class PrintEven {

	public static void main(String[] args) {

		int k=2;

		for(int i=0;i<=10;i++) {
			
			for(int j=1;j<=5;j++) {
				if(k<=100) {
				System.out.print(k+"\t");
				//System.out.println("\n");
				k=k+2;
			}
				else {
					break;
				}
			}
			System.out.println("");
		}

	}

}
