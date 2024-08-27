package com.interviewquestions;

public class Palindrome {

	public static void main(String[] args) {

		String str="refer";
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println("palindrome obj is:"+rev);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
	}

}
