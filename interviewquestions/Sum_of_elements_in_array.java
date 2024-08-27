package com.interviewquestions;

public class Sum_of_elements_in_array {

	public static void main(String[] args) {
		//1) Find Sum of Elements in Array
//	a={1,2,3,4,5}
//	Sum=15

	//Script:
	int[] a={1,2,3,4,5};
			int sumOf=0;
			for(int i =0; i<= a.length-1;i++) {
				sumOf= sumOf+a[i];
			}
			
			System.out.println(sumOf);

	}

}
