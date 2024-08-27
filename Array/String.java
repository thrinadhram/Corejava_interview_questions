package com.Array;

public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String str1 = "hello";
		java.lang.String str2 = "hello";
		java.lang.String str3 = new java.lang.String("hello");//instance
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str1.equals(str3));
		java.lang.String str4=new java.lang.String("hello");
		System.out.println(str3==str4);
		
		java.lang.String str6=str3;
		System.out.println(str3==str6);
		System.out.println(str3.equals(str4));
		
		
		

	}

}
