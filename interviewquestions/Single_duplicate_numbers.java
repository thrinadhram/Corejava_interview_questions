package com.interviewquestions;

public class Single_duplicate_numbers {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 9, 7, 6 };
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("the duplicate numbers is:" + arr[j]);
				}
			}
		}

	}

}
