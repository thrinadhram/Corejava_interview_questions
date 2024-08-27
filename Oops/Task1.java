package com.Oops;

public class Task1 {
	static int a = 10;
	int b = 20;
	static String name;
	String name1;

	public static void addition() {
		int c = a;
		int d = a + c;
		System.out.println("adding of two numbers : " + d);
	}

	public void subtraction() {
		byte s = 100;
		byte i = (byte) (s - b);
		System.out.println("subtraction of two numbers is : " + i);
	}

	public void method1() {
		String a;
		String b;
		a = "siri";
		b = "siri";
		name1 = new String("siri");
		name = name1;
		System.out.println(a == name1);
		System.out.println(a == b);
		System.out.println(name.equals(b));
	}

	public void method2(int a, int b) {
		int output = a * b;
		System.out.println(output);
	}

	public static void main(String[] args) {
		addition();
		Task1 ts = new Task1();
		ts.subtraction();
		ts.method1();
		ts.method2(9, 8);
	}

}
