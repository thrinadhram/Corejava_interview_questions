package com.interviewquestions;

import java.util.Arrays;
import java.util.Collections;

public class Sort_the_values_in_a_array {

	public static void main(String[] args) {
		//Ex-4: To sort the values in Array (descending order)
//		Script:
		Integer a[]= {3,4,2,5,1};
				System.out.println("Array before sorting: "+Arrays.toString(a));
				
				Arrays.sort(a,Collections.reverseOrder());
				
				System.out.println("Array After sorting: "+Arrays.toString(a));

	}

}
