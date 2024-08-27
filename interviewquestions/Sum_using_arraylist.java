package com.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Sum_using_arraylist {

	public static void main(String[] args) {
String sum="";
List<String>li=new ArrayList<String>();
li.add("10");
li.add("20");
li.add("30");
li.add("40");
System.out.println(li);
for(int i=0; i<=li.size(); i++) {
	if(i==1 || i==2) {
		sum+=Integer.parseInt(li.get(i));
	}
}
System.out.println(sum+"sum");
	}
	



	}


