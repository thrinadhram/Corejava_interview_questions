package com.arraylist;

import java.util.ArrayList;

public class Class3 {

	public static void main(String[] args) {
		ArrayList<String> myCars = new ArrayList<String>();

		// To assign string values
		myCars.add("Benz");
		myCars.add("XUV300");
		myCars.add("Audi");

		System.out.println(myCars);

		for (int i = 0; i <= myCars.size()-1; i++) {
			System.out.println(myCars.get(i));
			System.out.println();
			System.out.println("=============");
		
			if (myCars.get(i).equals("XUV300")) {
				// to change value
			myCars.set(i, "bmw");
			System.out.println(myCars);
			break;
	
		}

	}

	}
}

