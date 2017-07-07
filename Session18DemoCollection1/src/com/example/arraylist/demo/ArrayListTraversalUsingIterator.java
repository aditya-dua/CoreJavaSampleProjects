package com.example.arraylist.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversalUsingIterator {

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
		studentNameList.add("Aditya");
		
		
		Iterator<String> studentNameIterator=studentNameList.iterator();
		while(studentNameIterator.hasNext()){
			String studentName=(String) studentNameIterator.next();
			if(studentName.equalsIgnoreCase("Aditya")){
				studentNameIterator.remove();
			}else{
				System.out.println(studentName);
			}
			
		}
		
		
	}
}
