package com.example.arraylist.demo;

import java.util.ArrayList;

public class ArrayListDemoCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> nameList=new ArrayList<String>();
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
		
		
		
		
	}

}
