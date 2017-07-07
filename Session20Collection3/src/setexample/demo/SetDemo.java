package setexample.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Set Comes from Java Collection :: 
		 * What is the addition set has added for Collection ?
		 * Set : check of duplicacy.
		 * What will happen when you insert duplicate elements :
		 * 
		 * It will create a HAshMap internally and will check if you 
		 * element being inserted is already present . 
		 * If that is true it will replace the element with the new one.
		 * 
		 * How will you differenciate between two values being inserted..
		 * You are having a student : 3 attributes and you are checking the 
		 * uniqueness of a student by his id
		 * id : 1
		 * name : a
		 * age : 25
		 * 
		 * id : 2
		 * name : b
		 * age : 28
		 * 
		 * id : 1
		 * name : c
		 * age : 25
		 */
		
		/** decalaration of set**/
		
		HashSet<String> nameSet=new HashSet<>();
		nameSet.add("Aditya");
		nameSet.add("Aditya1");
		nameSet.add(null);
		
		/** Example of Conversion Constructor of Set **/
		HashSet<String> nameSet1=new HashSet<>(nameSet);
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Student1");
		nameList.add("Student2");
		nameList.add("Student3");
		
		/** I want to check if I can make a Set from an arrayList
		 * It is possible to add all the list elements to the set
		 *  **/
		HashSet<String> setFromList=new HashSet<>(nameList);
		
		//Set<String> exmapleSet=new Set<String>();
		/** We are using HashSet because ::
		 * Set is an interface ::: and HashSet is the implementation of Set.
		 * HashSET
		 * TreeSET
		 * LINKEDHASHSET
		 * **/
		
		
	}

}