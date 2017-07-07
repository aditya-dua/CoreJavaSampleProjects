package com.example.arraylist.demo;

import java.util.ArrayList;

public class ArrayListTraversalUsingForLoop {

	public static void main(String[] args) {
		

		ArrayList<String> nameList=new ArrayList<>();
		// capacity : in : 40 bytes
		nameList.add("Shanti");
		nameList.add("Bhawani");
		nameList.add("Nitish N");
		nameList.add("Nitish S");
		nameList.add("Vamshi");
		
		ArrayList<String> studentNameList=new ArrayList<>(nameList);
		studentNameList.add("Uma");
		studentNameList.add("Sumith");
		studentNameList.add("Mithun");
		studentNameList.add("Vishwas");
		
		// using the loop : studentNameList[i].toString()
		// i try the max 
		
		// How can i traverse :: that comes to your mind ?
		int sizeList=studentNameList.size();
		for(int i=0;i<sizeList;i++){
			String element= studentNameList.get(i).toString();
			System.out.println(element);
		}
		
	}
}
