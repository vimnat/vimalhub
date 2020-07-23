package org.company;

public class CompanyInfo {
	
	/*QUESTION 3:
   Project     :CompanyDetails
   Package     :org.company
   Class       :CompanyInfo
   Methods     :companyName(),companyId(),companyAddress()

Description:
Create an object for CompanyDetails class and call above methods also follow the all coding standards.*/
	
	public void companyName() {
		 System.out.println("Company Name");
	 }
	 
	public void companyId() {
		 System.out.println("Company Id");
	 }
	
	public void companyAddress() {
		 System.out.println("Company Address");
	 }
	
	
	public static void main(String[] args) {
		
		 CompanyInfo compInfo = new CompanyInfo();
		 compInfo.companyName();
		 compInfo.companyId();
		 compInfo.companyAddress();
		
		 
	 }

}
