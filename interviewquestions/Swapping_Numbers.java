package com.interviewquestions;

public class Swapping_Numbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		/*int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);*/
		b=a+b-(a=b);
		System.out.println(a);
		System.out.println(b);

	}
	}


