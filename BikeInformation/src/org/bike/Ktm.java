package org.bike;

public class Ktm implements Bike{
	
	@Override
	public void cost() {
	
		System.out.println("KTM cost");
		
	}

	@Override
	public void speed() {
		System.out.println("KTM Speed");
		
	}

	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
	}



}
