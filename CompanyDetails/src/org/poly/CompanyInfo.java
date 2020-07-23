package org.poly;

public class CompanyInfo {
	
	public void companyName() {
		System.out.println("company name Hexaware");
	}
	
	public void companyName(int compid) {
		System.out.println(compid);
	}
	
	public void companyName(String compname) {
		System.out.println(compname);
	}
	
	public void companyName(int emp1,int emp2,int emp3) {
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}
	
	public void companyName(String empn1,String empn2,String empn3) {
		System.out.println(empn1);
		System.out.println(empn2);
		System.out.println(empn3);
	}
	
	public void companyName(int empn1,String empn2) {
		System.out.println(empn1);
		System.out.println(empn2);
	}

	public void companyName(String empn1,int empn2) {
		System.out.println(empn1);
		System.out.println(empn2);
	}

	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyName(43421);
		c.companyName("hexa");
		c.companyName(123, 234, 345);
		c.companyName("asd", "dfg", "jhc");
		c.companyName(654, "adads");
		c.companyName("mnmbcj", 2321);

	}

}
