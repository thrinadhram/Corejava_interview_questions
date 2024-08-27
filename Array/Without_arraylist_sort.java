package com.Array;

import java.util.Arrays;

public class Without_arraylist_sort {

	public static void main(String[] args) {
int arr[]= {1,3,5,7,9,4,6,8,0};
int temp;
for(int i=0; i<arr.length; i++) {
	for(int j=i; j<arr.length; j++) {
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
System.out.println(Arrays.toString(arr));

	}

}
