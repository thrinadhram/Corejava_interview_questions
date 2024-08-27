package com.interviewquestions;

import java.util.Arrays;

public class Object_Array {

	public static void main(String[] args) {
		Object[] name = new Object[2];
		name[0] = "manisha";
		name[1] = 12345;

		System.out.println(Arrays.toString(name));

		for (Object x : name) {
			System.out.println(x);
		}

	}

}
