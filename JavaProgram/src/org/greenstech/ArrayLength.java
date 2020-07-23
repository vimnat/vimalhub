package org.greenstech;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayLength {

	public static void main(String[] args) {
		
		//QUESTION 4.1:
		//Description : Create a new ArrayListlist with values and find the length of it
			             // Input : List = 10,20,30,90,10,10,40,50

		List<Integer> li =new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		
		//QUESTION 4.2:
	    //Description : Create a new LinkedListlist with values and find the length of it
			            //  Input : List = 100,200,300,400,500,600,700
		
		List<Integer> li1 = new LinkedList<Integer>();
		li1.add(100);
		li1.add(200);
		li1.add(300);
		li1.add(400);
		li1.add(500);
		li1.add(600);
		li1.add(700);
		
		Integer a= li1.size();
		System.out.println(a);
		
		//QUESTION 4.3:
		//Description : Create a new vector with values and find the length of it
		//Input : List = 105,205,305,405,505,605,705,805
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(105);
		v1.add(205);
		v1.add(305);
		v1.add(405);
		v1.add(505);
		v1.add(605);	
		v1.add(705);	
		v1.add(805);	
		System.out.println(v1);
		Integer v2 = v1.size();
		System.out.println(v2);
		
		//QUESTION 4.4:
		//Description : Create a new LinkedListlist with values and find the size() of it. 
		//Input : List = 100,200,300,400,500,600,700
		//List<Integer> li1 = new LinkedList<Integer>();
		
		List<Integer> li2 = new LinkedList<Integer>();
		li2.add(100);
		li2.add(200);
		li2.add(300);
		li2.add(400);
		li2.add(500);
		li2.add(600);
		li2.add(700);
		
		System.out.println(li2);
		Integer b = li2.size();
		System.out.println(b);
		
		
		

	}

}
