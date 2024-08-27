package com.Oops;

import java.util.Scanner;

public class Class {
	
	public void add(int a, int b) {
		System.out.println("sum of a nd b is:"+(a+b));
	}
	
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a b values");
		int a=sc.nextInt(),b=sc.nextInt();
		Class c=new Class();
		c.add(a,b);
		
		

	}

}
