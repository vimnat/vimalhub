package org.bank;

public class BankInfo extends AxisBank {
	
	public void saving() {
		System.out.println("savings");
	}
	
	public void fixed() {
		System.out.println("fixed account");
	}

	public static void main(String[] args) {
		
		BankInfo b=new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();

	}

}
