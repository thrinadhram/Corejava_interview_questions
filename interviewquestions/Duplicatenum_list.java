package com.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicatenum_list {

	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,3));
		System.out.println("arraylist with duplicate numbers is:"+numbers);
		Set<Integer>set=new LinkedHashSet<Integer>();
		set.addAll(numbers);
		System.out.println(set);//duplicate numbers
		numbers.clear();
		System.out.println(numbers);
		
	
	}

}
