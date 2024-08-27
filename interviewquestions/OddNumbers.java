package com.interviewquestions;

public class OddNumbers {

	public static void main(String[] args) {
		int number = 25;
		System.out.println("print odd numbers from 1 to" + number);

		for (int j = 1; j <= number; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
			}

		}
	}
}
