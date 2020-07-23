package org.phone;

public class PhoneInfo {
	
	/*QUESTION 4:
   Project     :MyPhone
   Package     :org.phone
   Class       :PhoneInfo
   Methods     :phoneName(),phoneMieiNum(),Camera(),storage(),osName()

Description:
Create an object for PhoneInfo class and call above methods also follow the all coding standards.*/
	
	public void phoneName() {
		 System.out.println("Phone Name");
	 }
	 
	public void phoneMieiNum() {
		 System.out.println("Miei number");
	 }
	
	public void camera() {
		 System.out.println("Camera");
	 }
	
	public void storage() {
			
			System.out.println("storage");
		}
	public void osName() {
		
		System.out.println("os Name");
	}
	
	
	public static void main(String[] args) {
		
		 PhoneInfo pInfo = new PhoneInfo();
		 
		 pInfo.phoneName();
		 pInfo.phoneMieiNum();
		 pInfo.osName();
		 pInfo.storage();
		 pInfo.camera();
	 }


}
