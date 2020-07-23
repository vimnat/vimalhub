package org.poly;

public class Employee {

	
	public void empId() {
		
		System.out.println("43421");
	}
	
	public void empId(int a) {
		
		System.out.println(a);
	}
	
	public void empId(int a, int b) {
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public void empId(int a, int b, int c) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public void empId(String a) {
		
		System.out.println(a);
	}
	public void empId(String a, String b) {
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public void empId(String a, String b, String c) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empId(1234);
		e.empId("kjkjjf");
		e.empId(123, 345);
		e.empId("sdsf", "sdsd");
		e.empId(121, 2122, 231);
		e.empId("asda", "asda", "sdaedq");

	}

}
