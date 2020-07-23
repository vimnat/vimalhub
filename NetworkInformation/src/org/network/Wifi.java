package org.network;

public class Wifi {

	
	public void wifiName() {
		System.out.println("wifi name");
	}
	public static void main(String[] args) {
	
		Wifi w= new Wifi();
		MobileData md = new MobileData();
		Lan l = new Lan();
		Wireless wl = new Wireless();
		w.wifiName();
		md.dataName();
		l.lanName();
		wl.modemName();

	}

}
