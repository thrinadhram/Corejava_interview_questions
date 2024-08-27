package com.hashmap;

import java.util.HashMap;

public class Class1 {

	public static void main(String[] args) {
		//HashMap hm= new HashMap();
				//Map hm = new HashMap();
				
				HashMap<Integer,String> hm= new HashMap<Integer,String>();
				//Adding Data
				hm.put(101, "sirisha");
				hm.put(102, "sirisha");
				hm.put(103, "hyderabad");
				
				//To read all the values
				System.out.println(hm);
				
//				//To find number of pair of values
				System.out.println(hm.size());
//				
//				//To remove the value
				hm.remove(103);
				System.out.println(hm);
//				
//				//To read specific value
				System.out.println(hm.get(101));
//				
//				//To read only keys
			System.out.println(hm.keySet());
//				
//				//To read all the values
				for(Object k: hm.keySet()) {
					System.out.println(hm.get(k));
//				
				}
//
//				//To clear data
				hm.clear();


	}
}

