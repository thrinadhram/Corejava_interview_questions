package com.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Adding_Strings_ArrayList {

	public static void main(String[] args) {
String sum=" ";
List<String> add=new java.util.ArrayList<String>();
add.add("siri");
add.add("mani");
add.add("dady");
add.add("amma");
System.out.println(add);
for(int i=0;i<=add.size();i++) {
	if(i==1 || i==2) {
		sum+=add.get(i);
		
	}
}
System.out.println(sum+"sum");
	}

}
