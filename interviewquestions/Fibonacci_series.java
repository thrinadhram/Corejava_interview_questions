package com.interviewquestions;

public class Fibonacci_series {

	public static void main(String[] args) {
//		**Ex-7: Write program to display fibonacci series of numbers up to 100
//		0,1,1,2,3,5, 8, 13,21....
//		each number is equals to the sum of the preceding two numbers, 
//		which can start with zero or one

		//Script:

				int a= 0;
				int b=1;
				//System.out.println(a);//0
				//System.out.println(b);//1
				int c= a+b;//1
				while(c <= 100) {
					System.out.println(c);
					//swap the values
					a= b;
					b= c;
					c= a+b;
				}


	}

}
