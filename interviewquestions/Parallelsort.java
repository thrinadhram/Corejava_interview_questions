package com.interviewquestions;

import java.util.Arrays;

public class Parallelsort {

	public static void main(String[] args) {
		int a[]= {3,4,2,5,1};
		System.out.println("Array before sorting: "+Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("Array After sorting: "+Arrays.toString(a));


	}

}
