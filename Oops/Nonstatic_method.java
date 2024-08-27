package com.Oops;

public class Nonstatic_method {
	
	//we can crete an arthematic operation by using of nonstatic method
	
	
	public void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(" adding of a and b values are:"+c);
		
	}
	
	public void subtraction() {
		
		short c=12345;
		short d=23456;
		short e=(short) (d-c);
		System.out.println("subtract c and d value are:"+e);
		
	}
	
	public void multiplication() {
		byte f=127;
		byte g=126;
		byte h=(byte) (f*g);
		System.out.println("mutiply f and g values are:"+h);
		
	}
	
	public void division() {
		long i=123456789;
		long k=987654321;
		long z=k/i;
		System.out.println("division of i and k values are:"+z);
		
		
	}
//	public static void main(String[] args) {
//		Nonstatic_method nm= new Nonstatic_method();
//		nm.division();
//		nm.multiplication();
//		nm.subtraction();
//		nm.addition();
		
	}
	
	
	
	
	

//}
