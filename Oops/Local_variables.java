package com.Oops;

public class Local_variables {
	int x=10;
	static int result;
	String name;
	static String name2;

	public void method1() {
		String a;
		String b;
		a = "mindq";
		b = "mindq";
		name = new String("mindq");
		name2 = name;
		System.out.println(a == name);
		System.out.println(a == b);
		System.out.println(name2 == a);
		System.out.println(name2.equals(b));

		
		
	}
	
	public void localvariable() {
		int a;
		 int b;
		 int c;
		 a=5;
		 b=6;
		 c=x;
		 c--;
		 int d=c;
		 
		 result=a+b+x+c+d;
		 System.out.println(result);//39
	}
	public void localvarible1() {
		String name;
		String name2;
		String names="";
		int age;
		name="sirisha";
		name2="neelamsetti";
		names=name+name2;
		age=22;
		System.out.println("my name is:"+name+" "+"my age is:"+age);
	}
	public static void main(String[] args) {
		 String Local_variables ;
		 Local_variables lv;
		 lv=new Local_variables();
		 lv.method1();
		 lv.localvariable();
		 lv.localvarible1();
		 
		 System.out.println("main method result is:"+result);
		 
		 
		 
		 
		 
		
	}
}
