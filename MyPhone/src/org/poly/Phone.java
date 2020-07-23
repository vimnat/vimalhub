package org.poly;

public class Phone {
	
	public void phoneInfo() {
		System.out.println("Phone Info");
	}
	public void phoneInfo(String a) {
		System.out.println("mobile model: "+a);
	}
	public void phoneInfo(long a) {
		System.out.println("mobile numer: "+a);
	}
	public void phoneInfo(int a) {
		System.out.println("mobile model: "+a);
	}
	public void phoneInfo(float a) {
		System.out.println("IMEI: "+a);
	}
	
	public static void main(String[] args) {
		
		Phone p=new Phone();
		p.phoneInfo();
		p.phoneInfo("MI");
		p.phoneInfo(9003276760l);
		p.phoneInfo(43421);

	}

}
