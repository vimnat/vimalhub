package org.poly.payment;

import java.util.Scanner;

public class PaymentMethod {
	
	public void getPayment(String cardDetails) {
		
		System.out.println("Enter the Name on "+cardDetails+ ": ");
		
	}
	

	public void getPayment(long cardNumber) {
		
		System.out.println("Card number: "+cardNumber);
	}	
	
	public void getPayment(int cvv,String date) {
		
		System.out.println("CVV number: "+cvv +"\nExpiry date: " +date);
	}	
	
	public void getPayment(int cId,float bal) {
		System.out.println("Customer Id: "+cId +"\nAccount Balance: "+bal);
	}
	
	
	
	
	public static void main(String[] args) {
		
		PaymentMethod pm=new PaymentMethod();
		pm.getPayment(1678984378563746l);
		pm.getPayment("ICICI Debit Card");
		Scanner scanner = new Scanner(System.in);
		String name1=scanner.next();
		
		switch (name1){
		case "vimal": 
		pm.getPayment(4587984378563746l);
		pm.getPayment(328, "11/04/2020");
		pm.getPayment(478963, 87238.98f);
		break;
		default:
		    System.out.println("Card name matches not found");
		
		}
		
		pm.getPayment("SBI Credit Card");
		String name2=scanner.next();
		
		switch (name2){
		case "pavi":
		pm.getPayment(1678984378563746l);
		pm.getPayment(567, "22/10/2020");
		pm.getPayment(574893, 873527.87f);
		break;
		default:
		    System.out.println("Card name matches not found");
		}
		pm.getPayment("Hdfc Credit Card");
		String name3=scanner.next();
		scanner.close();
		
		switch (name3){
		case "ram":
		pm.getPayment(1678984378563746l);
		pm.getPayment(567, "22/10/2020");
		pm.getPayment(574893, 873527.87f);
		break;
		default:
		    System.out.println("Card name matches not found");
		}
		
	}

}
