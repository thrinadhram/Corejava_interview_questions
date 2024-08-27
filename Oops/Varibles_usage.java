package com.Oops;

public class Varibles_usage {
//student details
	
	String name;//non_s_v(different property(high memory))
	int rollno;//non_s_v(different property(high memory))
	
	static String collegename="BVRIT";//(s.v(common property)(low memory))
	
	//constructor method
	Varibles_usage(int r,String n){
		rollno=r;
		name=n;
		}
	
	static void clg_change_name() {
		collegename="mindq";
	}
	
	public void display() {
		System.out.println("my rollno:"+rollno+" "+"name:"+name+" "+"clg name is"+collegename);
	}
	
	public static void main(String[] args) {
		//clg_change_name();
		Varibles_usage.clg_change_name();//direct calling
		
		
		Varibles_usage v1=new Varibles_usage(266,"sirisha");
		v1.display();
		Varibles_usage v2=new Varibles_usage(206,"Thrinadh");
		v2.display();

	}

}
