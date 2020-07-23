package org.emp;

public class Employee {
	
	public void empID() {
		 System.out.println("Employee ID");
	 }
	 
	public void empName() {
		 System.out.println("Employee name");
	 }
	
	public void empDOB() {
		 System.out.println("Employee DOB");
	 }
	
	public void empPhone() {
			
			System.out.println("employee phone");
		}
	public void empEmail() {
		
		System.out.println("employee email");
	}
	public void empAddress() {
		
		System.out.println("employee address");
	}
		
		
	
	public static void main(String[] args) {
		
		 
		 Employee eDetails = new Employee();
		 
		 eDetails.empName();
		 eDetails.empID();
		 eDetails.empDOB();
		 eDetails.empAddress();
		 eDetails.empEmail();
		 eDetails.empPhone();
	 }
		 


}
