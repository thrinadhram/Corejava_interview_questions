package com.interviewquestions;

public class String_Buffer {

	public static void main(String[] args) {
String alphebets="abcdef";
StringBuffer sb=new StringBuffer(alphebets);
System.out.println(sb.reverse());

StringBuilder sdb=new StringBuilder("shirisha");
System.out.println(sdb);
System.out.println("reverse of sdb is:"+sdb.reverse());
	
	
StringBuilder sdb2=new StringBuilder("HI");
System.out.println(sdb2);
System.out.println(sdb2.append("hello"));
System.out.println(sdb2);
	}
	
	

}
