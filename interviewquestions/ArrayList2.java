package com.interviewquestions;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
ArrayList<String>data=new ArrayList<String>();
data.add("sirisha");
data.add("manisha");
data.add("daddy");
data.add("amma");
System.out.println(data);

System.out.println("-----------");
for(String x:data) {
	//System.out.println(x);
	if(x=="amma") {
		System.out.println(x);
	}
	else if(x=="sirisha") {
		System.out.println(x);
	}
}
	}

}
