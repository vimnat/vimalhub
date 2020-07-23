package org.phone;

public class InternalStorage {

	
	public void processorName() {
		System.out.println("processor name : Android");
	}
	
	public void ramSize() {
		System.out.println("ram size: 4 GB");
	}
	public static void main(String[] args) {
		
		InternalStorage is = new InternalStorage();
		ExternalStorage es = new ExternalStorage();
		
		is.processorName();
		is.ramSize();
		es.size();
	}

}
