package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {

	
	public void transportForm() {
		System.out.println("transport form");
	}
	
	public static void main(String[] args) {
		Transport tr = new Transport();
		Air a = new Air();
		Road r = new Road();
		Water w= new Water();
		tr.transportForm();
		a.aeroPlane();
		r.bike();
		r.bus();
		r.car();


	}

}
