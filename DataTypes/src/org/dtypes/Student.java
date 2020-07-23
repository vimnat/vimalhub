package org.dtypes;

public class Student {
	
	public void sDetails() {
		
		String name = "Vimal";
		System.out.println("Student name:"+ name);
		
		int num = 43421;
		System.out.println("Rollnumber: "+ num);
		
		char a = 'A';
		System.out.println("Section: "+ a);
		
		long b = 9003276760l;
		System.out.println("Mobile number: "+ b);
		
		float c = 24.9567435433221f;
		System.out.println("Gpa: "+ c);
		
		double d = 43.43523453246546643434d;
		System.out.println("CGPA: "+ d);
		
		boolean attend = true;
		System.out.println("Present: "+ attend);
		
		byte male = 127;
		System.out.println("Total number of  male student: "+ male);
		
		short female = 192;
		System.out.println("Total number of  female student: "+ female);
		
		int all = male + female;
		System.out.println("Total number of Students: " + all);
		
		
		
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		s.sDetails();

	}

}
