package com.Oops;

public class Globalavaribles2 extends Global_variable {

	public void method() {
		z = true;
		m = true;
		boolean k = false;
		console = (z == m);
		console2 = (!k);
		System.out.println(console);
		System.out.println(console2);
	}

	public void method1() {
		a = 100;
		a--;
		b = a;
		a--;
		b++;
		int c = 200;
		c = a + b;
		result = c;
		System.out.println(result);
	}

	public void method2() {
		x = "amma";
		y = "dady";
		output = x + y;
		StringBuffer sbf = new StringBuffer(output);
		sbf.append(console);
		System.out.println(sbf);
	}
	public static void main(String[] args) {
		Globalavaribles2 gv=new Globalavaribles2();
		gv.method();
		gv.method1();
		gv.method2();
	}

}
