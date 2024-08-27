package com.interviewquestions;

public class Split_method1 {

	public static void main(String[] args) {
		String str="sirisha manisha daddy amma";
		System.out.println(str);
		String s[]=str.split(" ", 4);
		for(String i:s) {
			System.out.println(i);
		}
	}
	}


