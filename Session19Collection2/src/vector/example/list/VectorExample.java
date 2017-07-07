package vector.example.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> languageVector=new Vector<>();
		languageVector.add("Java");
		languageVector.add("C++");
		languageVector.add(1,"Android");
		
		Iterator<String> vectorIterator=languageVector.iterator();
		while (vectorIterator.hasNext()) {
			String string = (String) vectorIterator.next();
			System.out.println(string);
		}
	}

}
