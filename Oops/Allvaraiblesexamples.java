package com.Oops;

public class Allvaraiblesexamples {
	
	static int staticcount;
	int instancecount;
	
	
	public Allvaraiblesexamples() {//constructor
		staticcount++;//increment static
		instancecount++;
	}
	
//	public  void method1() {
//		staticcount++;//increment static
//		instancecount++;//increment instance
//		}
//	
	public static void outputmethod2() {
		System.out.println("total static count is:"+staticcount);
		
	}
	
	public static void main(String[] args) {
		
		Allvaraiblesexamples av1=new Allvaraiblesexamples();
		Allvaraiblesexamples av2=new Allvaraiblesexamples();
		Allvaraiblesexamples av3=new Allvaraiblesexamples();
		Allvaraiblesexamples.outputmethod2();
	System.out.println("total intsnce count is:"+av1.instancecount);
		
		

	}

}
