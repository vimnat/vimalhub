package org.poly;

public class GreensTech {

	
	public void greensOmr(byte order) {
		System.out.println("Order with number: "+order);
	}
	public void greensOmr(String type) {
		System.out.println("Type: "+type);
	}
	public void greensOmr(int num) {
		System.out.println("Number: "+num);
	}
	public static void main(String[] args) {
	
		GreensTech g=new GreensTech();
		g.greensOmr(4);
		g.greensOmr("Selenium");
		g.greensOmr(9003);

	}

}
