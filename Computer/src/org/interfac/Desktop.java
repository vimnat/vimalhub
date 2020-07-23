package org.interfac;

public class Desktop implements Software,Hardware {
	
	@Override
	public void hardwareResources() {
		System.out.println("hardware comp");	
	}
	@Override
	public void softwareResources() {
		System.out.println("software comp");	
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.hardwareResources();
		d.softwareResources();
	}
}
