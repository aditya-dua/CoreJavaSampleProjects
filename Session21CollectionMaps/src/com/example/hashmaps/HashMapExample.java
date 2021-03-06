package com.example.hashmaps;

import java.awt.Checkbox;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** 
		 * What is a Hash Map ? 
		 * What is a Map ? Is Map a Collection ? 
		 */
		
		HashMap<Integer , String> exampleMap=new HashMap<>();
		exampleMap.put(1, "Aditya");
		exampleMap.put(2, "Rachit");
		exampleMap.put(4, "Sumit");
		exampleMap.put(2, "Rohit");
	
		
		if(exampleMap.containsKey(2)){
			System.out.println("Key is already Present");
		}else{
			exampleMap.put(2, "Rohit");
		}
		
		exampleMap.replace(4, "New Value");
		System.out.println(exampleMap.get(4));
		exampleMap.put(null, "1");
		exampleMap.put(null, "2");
		exampleMap.put(6,null);
		exampleMap.put(7,null);
		exampleMap.put(8,null);
//		if(checkMapKey(2, exampleMap)){
//			System.out.println("Key is already Present");
//		}else{
//			exampleMap.put(2, "Rohit");
//		}
//		
		HashMap<Integer, String> exampleCopy=new HashMap<>(exampleMap);
		
		/// Any doubts till here..
		
		String value = exampleMap.get(2);
		System.out.println(value);
	}
	
	public static boolean checkMapKey(int key,HashMap<Integer, String> example){
		if(example.containsKey(key)){
			return true;
		}else{
			return false;
		}
	}
}
