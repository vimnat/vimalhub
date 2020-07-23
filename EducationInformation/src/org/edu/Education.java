package org.edu;

public class Education extends Engineering {
	
	public void ug() {
		System.out.println("ug class");
	}
	
	public void pg() {
		System.out.println("pg class");
	}

	public static void main(String[] args) {
		Education e= new Education();
		e.ug();
		e.pg();
		e.bA();
		e.bBa();
		e.bE();
		e.bEd();
		e.bTech();
		e.dental();
		e.mbbs();
		e.physiyo();
	}

}
