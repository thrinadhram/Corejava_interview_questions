package com.interviewquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_numbers_remove {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 7, 9, 2, 9, 3, 4, 4, 3, 6, 7, 6);
		Set<Integer> changelist = new HashSet<Integer>(list);
		changelist.forEach(System.out::println);
	}

}
