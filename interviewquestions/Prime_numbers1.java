package com.interviewquestions;

public class Prime_numbers1 {

	public static void main(String[] args) {
//		**Ex-6: write program to display Prime numbers between 1 to 100
//		A Prime number can be divided evenly only by 1 and itself
//		Script:
				
				int cnt;
				System.out.println("Printing Prime numbers from 1 to 20");
				//loop through the numbers one by one
				for(int n = 1; n <= 20; n++) {
					cnt=0;
					//to check if the number is prime
					for(int i=1; i<=n; i++) {
						if(n% i==0) {
							cnt++;
						}
					}
					
					if(cnt==2) {
						System.out.print(n+", ");
					}
				}


	}

}
