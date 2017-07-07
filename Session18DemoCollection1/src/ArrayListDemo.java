import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {

		/**
		 * ArrayList<String>(); => create an empty with intial capacity of 10.
		 * ArrayList<>(countryList);=> it will create a list with the collection passed in the constructor
		 */
		// I will get tyhe cuurent time and then will reuse this time when we compare 2 collections.

		ArrayList<String> countryList=new ArrayList<String>();
		long timeNow = System.currentTimeMillis();
		System.out.println(new Date(timeNow));
		countryList.add("India");
		countryList.add("China");
		countryList.add("USA");
		countryList.add("Russia");
		countryList.add("UK");
		countryList.add("Japan");
		countryList.add("Thailand");		
		countryList.add("Singapore");
		countryList.add("Australia");
		countryList.add("Germany");
		countryList.add("France");
		countryList.add("England");

		/**for(int i=0;i<countryList.size();i++){
			System.out.println(countryList.get(i));
		}**/
		Collections.sort(countryList);

		//System.out.println("Sorted List goes Below");

		/*for(int i=0;i<countryList.size();i++){
			System.out.println(countryList.get(i));
		}*/

		Iterator<String> listIteratro=countryList.iterator();

		while (listIteratro.hasNext()) {
			String country = (String) listIteratro.next();
			if(country.equals("Germany")){
				listIteratro.remove();
				//System.out.println("Germany is removed");
			}


		}

		Iterator<String> list1Iteratro=countryList.iterator();
		System.out.println("after germany removed");
		while (list1Iteratro.hasNext()) {
			String country = (String) list1Iteratro.next();
			System.out.println(country);


		}
		/*for(int i=0;i<1000000;i++){
			countryList.add("Value"+i);
		}*/
		/** Methods for Individual Elements**/
		System.out.println(countryList.size());
		System.out.println(countryList.isEmpty());
		System.out.println(countryList.contains("India"));
		
		/** Methods are for Entire Collection Object**/
		ArrayList<String> indiaSubContList=new ArrayList<>();
		indiaSubContList.add("Nepal");
		indiaSubContList.add("Sri Lanka");
		System.out.println(countryList.addAll(indiaSubContList));
		System.out.println(countryList.containsAll(indiaSubContList));
		
		
		/** Traversing Collections
		 * 1. For Each Loop
		 * 2. Iterator :
		 * 
		 * Iterator is an Interface, which will help me traverse on the object of 
		 * collections one by one ..
		 * When we iterate over list , we have separate iterator called the ListIterator
		 * Iterator has following methods ::
		 * 1. hasNext();
		 * 2. next();
		 * 3. remove();
		 * 
		 * ListIterator has following methods ::
		 * 1. hasPrevious();
		 * 2. previous();
		 * 
		 *  **/
		/* To Initialize the Iterator*/
		
		Iterator<String> countryIterator=countryList.iterator();
		
		while(countryIterator.hasNext()){
			String value = (String) countryIterator.next();
			System.out.println(value);
		}
		countryList.clear();
		
		timeNow = System.currentTimeMillis();
		System.out.println(new Date(timeNow));

		

				/** Conversion Constructor: 
				 * which will help to create a new collection from existing one **/
		//ArrayList<String> regionList=new ArrayList<>(countryList);
		//ArrayList<String> cityList=new ArrayList<>(25);


		ArrayList<String> dupCountryList=new ArrayList<>();
		dupCountryList.addAll(countryList);
	}

}
