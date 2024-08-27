package com.interviewquestions;

import java.util.Arrays;

public class Object_Arrays {

	public static void main(String[] args) {
Object[] myValues= new Object[3];
		
		myValues[0]= 100;
		myValues[1]= "sirisha";
		myValues[2]= "sirisha@1234";
		System.out.println(Arrays.toString(myValues));
		
		for(Object x : myValues) {
			System.out.println(x);
		}
		

	}

}
