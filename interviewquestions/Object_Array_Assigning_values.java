package com.interviewquestions;

public class Object_Array_Assigning_values {

	public static void main(String[] args) {
Object[][] myValues= new Object[3][2];
		
		//Assign values
		myValues[0][0]= 100;
		myValues[0][1]= 200;
		
		myValues[1][0]= "Mindq";
		myValues[1][1]= "systems";
		
		myValues[2][0]= true;
		myValues[2][1]= false;
		
		
		
		for(int i = 0; i <= myValues.length-1; i++) {
			for(int j= 0; j<= myValues[i].length-1; j++) {
			
			System.out.print(myValues[i][j]+"  ");
			}
			
			System.out.println();
		}	

	}

}
