package com.Oops;

public class Parameter_variable {
	String x;
	String y;

	public void addition(int a, int b) {
		int c;
		c = a + b;
		System.out.println("addition of a b parameter values are:" + c);
	}

	public void concat(String a, String b) {

		x = "Sirisha";
		y = x.concat(a);
		String z = "manisha";
		String k = z.concat(b);
		System.out.println(y + " " + k);
	}

	public void address(String name, int dno, String state) {
		String s = new String(name);
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);

		int doornumber = dno;

		System.out.println(
				"my village name is:" + sb + " " + "my door number is:" + doornumber + "" + "my state is:" + state);

	}

	public static void main(String[] args) {
		Parameter_variable pv = new Parameter_variable();
		pv.addition(10, 10);
		pv.concat("develpper", "tester");
		pv.address("Hyderabad", 5_28_22, "TG");

	}

}
