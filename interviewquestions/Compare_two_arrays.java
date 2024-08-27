package com.interviewquestions;

import java.util.Arrays;  

public class Compare_two_arrays {

	public static void main(String[] args) {
//		Ex-5: compare two Arrays
//		script:
		int a[] = { 1, 4, 48, 50 };
		int b[] = { 1, 4, 40, 50 };
		if (Arrays.equals(a, b)) {
			System.out.println("Both the arrays are equal");
		} else {
			System.out.println("Both the arrays are not equals");
		}

	}

}
