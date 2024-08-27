package com.Array;

public class Two_dimenstional_array {

	public static void main(String[] args) {
		//Declaration of an 2D-Array
				int[][] myValues= new int[3][2];
				
				myValues[0][0]= 100;
				myValues[0][1]= 200;
				
				myValues[1][0]= 300;
				myValues[1][1]= 400;
				
				myValues[2][0]= 500;
				myValues[2][1]= 600;
				
				//size of an 2D array(i.e. Rows)
				System.out.println(myValues.length);
				//To find number of columns in 1st row
				System.out.println(myValues[0].length);
//				
//				//To read all the values
			for(int i =0; i<= myValues.length-1; i++) {
				for(int j= 0; j<= myValues[i].length-1; j++) {
					System.out.print(myValues[i][j]+", ");
					}
					System.out.println();
//					
				}
			for(int i[]:myValues) {
				for(int j:i) {
					System.out.println(j+" ");
				}
				
				System.out.println();
			}

	}
}
			
	
	


