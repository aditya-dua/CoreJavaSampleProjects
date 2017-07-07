package com.example.arraylist.demo;

import java.util.ArrayList;

public class ArrayListTraversalUsingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		for( String studentName : studentNameList){
			System.out.println(studentName);
		}
		/** internally **
		 * for(int i =0;i<studentNameList.size();i++){
		 * String studentName=studentNameList.get(i);
		 * }
		 */
	}

}
