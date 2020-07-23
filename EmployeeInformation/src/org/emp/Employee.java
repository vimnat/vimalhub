package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {

	public void empName() {
		System.out.println("Emplayee name : Vimal");
	}

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		Company comp = new Company();
		Client cl = new Client();
		Project pr = new Project();
		
		emp.empName();
		comp.companyName();
		cl.clientName();
		pr.projectName();

	}
}
