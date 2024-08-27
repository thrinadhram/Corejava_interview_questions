package com.Array;

import java.util.Arrays;

public class Array_class1 {

	public static void main(java.lang.String[] args) {
		
		//syntax of array
		//datatype [] arrayname=new datatype[size];
		java.lang.String[] courses=new java.lang.String[3] ;
		courses[0]="manual";
		courses[1]="automation";
		courses[2]="java";
		System.out.println("to find number of values:"+courses.length);
		
		System.out.println(Arrays.toString(courses));
		
		System.out.println(courses[0]);
		System.out.println(courses[2]);
		
		for(int i=0; i<=courses.length-1; i++) {
			System.out.println(courses[i]);
			System.out.println(i);
		}
		
		//for( datatype varibalename:collection or array name)
		for(java.lang.String abc:courses) {
			
					System.out.println(abc);
		}
		
		
		

		
	}

}
