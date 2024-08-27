package com.Oops;

public class Paramenter_example {

	public void method1(int a, int b) {
		System.out.println("adding of two value sare:" + (a + b));

	}

	public void method2(int c, int d) {
		int output = c * d;
		System.out.println(output);

	}

	public static void main(String[] args) {
		Paramenter_example pe = new Paramenter_example();
		pe.method1(100, 200);
		pe.method2(10, 10);

	}

}
