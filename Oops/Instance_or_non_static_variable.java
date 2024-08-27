package com.Oops;

public class Instance_or_non_static_variable {
	int result;// instance varibale or nonstatic varaible
	String result1;
	String z = "nillamsetti";
	short a;
	short b=23456;
	short result2;

	public void method1() {
		int x = 100;
		int y = 200;
		// result=y/x;
		this.result = x * y;
		System.out.println("mutiplication of x and y value are:" + result);

	}

	public void method2() {
		String x = "sirisha";
		String y = "manisha";
		this.result1 = x + y;//this keyword use in nonstatic varible 
		String output = result1.concat(z);
		System.out.println("concat of 3 staring names are:" + output);

	}

	public void method3() {

		a = 12345;
	this.result2=(short) (b-a);
	System.out.println(result2);
	

	}
	
	public static void main(String[] args) {
		Instance_or_non_static_variable nv;//
		nv=new Instance_or_non_static_variable();
		nv.method1();
		nv.method2();
		nv.method3();
		
	}

	

}
