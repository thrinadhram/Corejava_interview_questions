package com.interviewquestions;

public class Reverse_of_a_String_Using_Array {

	public static void main(String[] args) {
String name="abcd";
String reverse="";
//usimg chartAT array 
char a[]=name.toCharArray();
int length=a.length;
System.out.println(length);
for(int i=length-1;i>=0;i--) {
	reverse=reverse+a[i];
	System.out.println("reverse string is:"+reverse);
}
	}

}
