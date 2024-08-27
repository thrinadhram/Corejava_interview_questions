package com.interviewquestions;

public class Find_number_of_same_letters {

	public static void main(String[] args) {

//		Ex-10:write program to find number of times occurence of "s" in "Mindqsystems"
//		and print indexes of each "s" occurent
//		script:
//		//occurence of -e
		String str = "sirisha neelamsetti";
		int cnt = 0;
		for (int i = 0; i <= str.length() - 1; i++) {

			if (str.charAt(i) == 'e') {
				cnt++;
				System.out.println("index of e is: " + i);
			}

		}
		System.out.println("Number of times e occurence is in a given string is: " + cnt);

	}

}
