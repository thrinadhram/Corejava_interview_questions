package com.interviewquestions;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int m = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 20; i++) {
			System.out.println(m +"  *" +i+" = "+(m*i)); 
		}
	}

}
