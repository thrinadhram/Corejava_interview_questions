package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Class1 {

	public static void main(String[] args) {
		ArrayList<String> myCars= new ArrayList<String>();
		myCars.add("benz");//index 0 
		myCars.add("audi");//index 1
		myCars.add("rose royals");
		
		
		System.out.println(myCars);
		Collections.sort(myCars);
		System.out.println(myCars);
		
		
		
		
		

	}

}
