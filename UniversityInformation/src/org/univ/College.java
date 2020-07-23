package org.univ;

public class College extends University {

	
	public void ug() {
		System.out.println("College ug class");
	}
	
	public void pg() {
		System.out.println("college pg class");
	}

	public static void main(String[] args) {
		
		College c=new College();
		c.ug();
		c.pg();


	}

}
