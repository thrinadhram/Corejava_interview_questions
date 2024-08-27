package com.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Class1 {

	public static void main(String[] args) {
		HashSet mySet= new HashSet();
		//Set mySet = new HashSet();
		//HashSet<String> mySet = new HashSet(); --> for Homegenious data
		
		mySet.add("sirisha");
		mySet.add(250);
		mySet.add(10.786);
		mySet.add("sirisha");
		
		//To find number of values
		System.out.println("Number of values are: "+mySet.size());//3
		//To read all the values
		System.out.println(mySet);  
		//to remove specific value
		mySet.remove(10.786);
		System.out.println(mySet);
	
		Iterator<Object>alldata=mySet.iterator();
		for(int i=0; i<=mySet.size()-1; i++) {
			System.out.println(alldata.next());
		}
		System.out.println("=======================");
		
		//to read all the values
		for(Object x : mySet) {
			System.out.println(x);
		}
		
		
		

	}

}
