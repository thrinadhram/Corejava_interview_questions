package com.interviewquestions;

public class EvenNumbers {

	public static void main(String[] args) {
		int limit = 10;
		System.out.println("print even numbers 1 to" + limit);

		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}

}
