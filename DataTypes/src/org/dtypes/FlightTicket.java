package org.dtypes;

import java.util.Scanner;

public class FlightTicket {
	
	public void scannereg() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");  
		String name = sc.nextLine();
		System.out.println("Name is: "+ name);
		System.out.println("Enter Airlines: ");
		String aname = sc.nextLine();
		System.out.println("Airlines name: "+ aname);
		System.out.println("Enter Airlines number: ");
		int anum = sc.nextInt();
		System.out.println("Airlines number: "+ anum);
		
		
		 
	}

	public static void main(String[] args) {
		
		FlightTicket ft = new FlightTicket();
		ft.scannereg();
	}

}
