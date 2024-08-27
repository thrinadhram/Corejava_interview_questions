package com.Oops;

public class Class_variables {
	
	static int result;
	static int c=10;
	//static varible or class varible 
	public static void method1() {
		
		int a=10;
		int b=20;
		result=a+b;
		
		int output=result+c;
		System.out.println(" addinf of a and b values are:"+output);
		
		
	}
	public void method2() {
		int x=100;
		int z=200;
		result=z-x-c;
		System.out.println("subtract x and z values are:"+result);
		
	}
	
	public static void main(String[] args) {
		Class_variables cv=new Class_variables();
		cv.method1();
		cv.method2();
	}
	
	
	
	

}
