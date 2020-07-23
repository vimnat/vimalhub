package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	
	
	public void VehicleNecessary() {
		System.out.println("vehicle : Innova");
	}

	public static void main(String[] args) {

		Vehicle vh = new Vehicle();
		TwoWheeler tw = new TwoWheeler();
		ThreeWheeler dw = new ThreeWheeler();
		FourWheeler fw = new FourWheeler();
		vh.VehicleNecessary();
		tw.bike();
		dw.Auto();
		fw.car();
		fw.bus();
		fw.lorry();
		

	}

}
