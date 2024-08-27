package com.interviewquestions;

import java.util.Arrays;
import java.util.List;

public class Collection_of_String_data {

	public static void main(java.lang.String[] args) {
		java.lang.String names[]= {"mani","ram","ravi"};
			List<java.lang.String> a=Arrays.asList(names);
			System.out.println(a);
			a.add("ganesh");
			a.add("suresh");
			a.add("pawan");
			System.out.println(a);
		}
		
	}


