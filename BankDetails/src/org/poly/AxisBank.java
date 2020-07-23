package org.poly;

public class AxisBank extends BankInfo {
	
	
	public void deposit() {
		System.out.println("Axis deposit account");
		super.deposit();
}

	public static void main(String[] args) {
		
		AxisBank a= new AxisBank();
		a.deposit();
		a.saving();
		a.fixed();
		

	}

}
