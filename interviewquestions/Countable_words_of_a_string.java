package com.interviewquestions;

public class Countable_words_of_a_string {

	public static void main(String[] args) {
		String str = "hello india hyderabad";

		int count = 1;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}

		}
		System.out.println(count);
	}
}
