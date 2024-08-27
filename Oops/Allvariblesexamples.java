package com.Oops;

public class Allvariblesexamples {
	
	
	//intsnace varible
	int instancevarible;
	
	//class varible
	static int classvarible;
	
	public void method1() {
		//local varible
		int localvarible;
		localvarible=10;
		instancevarible=localvarible+5;
		classvarible+=instancevarible;
		classvarible++;
		
		System.out.println("instance varaible value:"+instancevarible);
		System.out.println("class varaible value:"+classvarible);
		System.out.println("local varaible value:"+localvarible);
		
	}
	public static void main(String[] args) {
		Allvariblesexamples ave=new Allvariblesexamples();
		ave.method1();
		
	}
	

}
