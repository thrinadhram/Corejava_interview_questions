package com.interviewquestions;

import java.util.ArrayList;
import java.util.TreeSet;

public class Duplicate_Numbers {

	public static void main(String[] args) {
		//****************************very very imp
		ArrayList<Integer> duplicate= new ArrayList<Integer>();
		duplicate.add(1);
		duplicate.add(2);
		duplicate.add(3);
		duplicate.add(1);
		System.out.println(duplicate);
		TreeSet<Integer>set=new TreeSet<Integer>(duplicate);
		ArrayList<Integer>duplicate1=new ArrayList<Integer>(set);
		System.out.println(duplicate1);

	}
	}


