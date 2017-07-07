package linkedlist.example;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** 
		 * add , get => list interface 
		 * offer,peek => queue interface
		 */
		LinkedList<String> listexample= new LinkedList<>();
		listexample.add("Aditya");
		listexample.addFirst("Exmaple");
		listexample.offer("New Example");
		listexample.offerLast("AT THE END");
		listexample.add(3, "AT 3 ####");
		listexample.add("NORmal");
		listexample.addFirst("FIRST Exmaple");
		listexample.offer("Not New Example");
		listexample.offerLast("AT THE END");
		listexample.add(3, "AT 33 ####");
		
		
		listexample.removeLast();
		listexample.remove(3);
		listexample.poll();
		listexample.pollLast();
		listexample.pollLast();
		
		System.out.println(listexample.peek());
		System.out.println(listexample.peekLast());
		System.out.println(listexample.get(3));
		//for (String string : listexample) {
	//		System.out.println(string);
		//}
		
	}

}
