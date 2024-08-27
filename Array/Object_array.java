package com.Array;

public class Object_array {

	public static void main(String[] args) {
//		Object Array:
//			which we can use to store different data type values(i.e. Hetrogenious data)
//			but in practical it is not preferred
//		Ex:
		Object[] myValues= new Object[3];
				
				myValues[0]= 100;
				myValues[1]= "sirisha";
				myValues[2]= 25;
				
				for(Object x : myValues) {
					System.out.println(x);
				}


	}

}
