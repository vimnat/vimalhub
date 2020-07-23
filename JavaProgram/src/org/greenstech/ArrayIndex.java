package org.greenstech;

import java.util.LinkedList;
import java.util.List;

public class ArrayIndex {

	public static void main(String[] args) {
		
		//QUESTION 5.1:
		//Description : Get the first index value of 10 
		//Input:   List = 10,20,30,90
		
		List<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		
		System.out.println(li);
		System.out.println(li.indexOf(10));
		
		
		//QUESTION 5.2:
		//Description : Get the last index value of 10 
		//Input:   List = 10,20,30,90,10,10,40,50
		
		List<Integer> li1 = new LinkedList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(90);
		li1.add(10);
		li1.add(10);
		li1.add(40);
		li1.add(50);
		
		System.out.println(li1);
		System.out.println(li1.lastIndexOf(10));

		
		

	}

}
