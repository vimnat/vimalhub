package org.company;

public class Company extends Client{
	
	public void companyName() {
		
		System.out.println("company name is hexaware");
	}

	public static void main(String[] args) {
		
		Company c=new Company();
		c.clientName();
		c.companyName();
	}

}
