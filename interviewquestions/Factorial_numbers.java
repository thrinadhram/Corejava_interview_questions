
package com.interviewquestions;

import java.util.Scanner;

public class Factorial_numbers {

	public static void main(String[] args) {
//		Ex-8: write program to find Factorial for a given number 
//		5 factorial is: 1*2*3*4*5=120

		//Script:
		//to read user input
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		sc.close();
			int fact=1;
			for(int i=1; i<=number; i++) 
			{
				fact=fact*i;
				}
			System.out.println("Factorial of "+number+" is: "+fact);


	}

}
