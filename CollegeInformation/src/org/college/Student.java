package org.college;

public class Student extends College {

	public void studentName() {
		System.out.println("student name : Vimal");
	}

	public void studentDept() {
		System.out.println(" Student Dept : ICE");
	}

	public void studentId() {
		System.out.println("student id : 08u277");
	}
	
	public static void main(String[] args) {
		
		Student st = new Student();
		st.studentName();
		st.studentDept();
		st.studentId();
		st.collegeName();
		st.collegeRank();
		st.collegeCode();
		st.deptName();
		st.hostelName();
		
	}

}
