package org.poly.payment;

public class Payment extends PaymentMethod {
	
	public void getPayment(long cardNumber) {
		
		System.out.println("Card number: "+cardNumber);
		
	}	
	
	
	
	public static void main(String[] args) {
		
		Payment p=new Payment();
		p.getPayment(0);
		p.getPayment(0);
		p.getPayment("Axis bank");
		p.getPayment(875);
		p.getPayment(4587984378563746l);
		
	}

}
