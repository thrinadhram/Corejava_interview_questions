package com.interviewquestions;

public class No_Of_Words_in_a_String {

	public static void main(String[] args) {
		 String str = "sirisha manisha hello world";
		   int count = 1;
	     for (int i = 0; i < str.length() - 1; i++)
	        {
	            if((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
	            {
	                count++;
	            }
	        }
	        System.out.println("Number of words in a string : " + count);
	    }
	
	


	}


