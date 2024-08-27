package com.Oops;

public class Blocks {
	public Blocks() {// constructor block
		System.out.println("hi sirsiha");

	}

	static {
		System.out.println("hi hello");

	}
	static {
		System.out.println("hi ");

	}

	public static void a() {
		System.out.println("hello hyd");
	}

	{
		System.out.println("hello namasthe");
	}
	{
		System.out.println("hello srnagar");
	}

	public void b() {
		System.out.println("hello mindq systems");
	}

	public static void main(String[] args) {

		Blocks b = new Blocks();

		b.a();
		b.b();

	}

}
