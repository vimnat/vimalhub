package org.poly;

public class Arts extends Education {

	
	public void bsc() {
		System.out.println("bsc class");
	}
	
	public void bEd() {
		System.out.println("bEd class");
	}
	
	public void bA() {
		
		System.out.println("ba class");
	}
	
	public void bBa() {
		System.out.println("bBa class");
	}
	
	public void ug() {
		System.out.println("Arts ug class");
	}
	
	public void pg() {
		System.out.println("Arts pg class");
	}
	public static void main(String[] args) {
		
		Arts a=new Arts();
		a.bA();
		a.bBa();
		a.bEd();
		a.bsc();
		a.ug();
		a.pg();

	}

}
