package com.Oops;

public class Global_variable {
	int a;
	int b;
	int result;
	String x;
	String y;
	String output;
	boolean z;
	boolean m;
	boolean console;
	boolean console2;
	
	
	public void true_false() {
		z=true;
		m=false;
		console=(z==m);//false
		System.out.println(console);
		
		
	}
	public void intvalues() {
		a=10;
		a++;
		b=a;
		b--;
		result=b;
		System.out.println(result);
	}
	
	public void stringvalues() {
		for(int i=0; i<=5; i++) {
			System.out.println(i);
			System.out.println("----------------------");
			x="sirisha";
			y="manisha";
			output=x+y;
			StringBuilder sbd=new StringBuilder(output);
			sbd.reverse();
			System.out.println(sbd);
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
		Global_variable key=new Global_variable();
	
		key.true_false();
		key.intvalues();
		key.stringvalues();
		
		
	}
	
	
   
}
