package com.interviewquestions;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check prime number or not");
		int a = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Number is a prime number");
		} else {
			System.out.println("Number is not a prime number");
		}
	}

}
