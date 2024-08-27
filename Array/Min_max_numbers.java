package com.Array;

import java.util.Arrays;

public class Min_max_numbers {

	public static void main(String[] args) {
int arr[]= {3,7,1,4,6,2,5};
//minimum munbers
int min=Arrays.stream(arr).min().getAsInt();
System.out.println(min);
//maximum numbers
int max=Arrays.stream(arr).max().getAsInt();
System.out.println(max);

	}

}
