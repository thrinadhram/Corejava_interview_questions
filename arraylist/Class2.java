package com.arraylist;

import java.util.ArrayList;

public class Class2 {

	public static void main(String[] args) {
		ArrayList<String> myCars= new ArrayList<String>();
		myCars.add("volvo");//index 0 
		myCars.add("desire");//index 1
		myCars.add("benz");
		//to find the number values
		System.out.println("overall data is:"+myCars.size());
		//to read second value
		System.out.println(myCars.get(2));
		
		System.out.println(myCars.get(0));
		
		//to change 2nd index value
		myCars.set(1, "scorpio");
		System.out.println(myCars);
		
		
		//to remove second value
		myCars.remove(0);
		System.out.println(myCars);
		
		//clear
		myCars.clear();
		System.out.println(myCars);
	
		
	}

}
