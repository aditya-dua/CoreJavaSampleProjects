package string.demo;

public class StringObjectExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Aditya";
		String str1="Aditya";
		
		String str4=new String("ADitYa");
		// How will you compare two Strings...?
		if(str==str1){
			//Lets compare String using ==
			System.out.println("str==str1");
			System.out.println("str ::"+str);
			System.out.println("str1 ::"+str1);
			
		}else{
			System.out.println("str!=str1");
		}
		// == => we are comparing the reference ::
		// str ="Aditya"; It creates a new reference of string "Aditya" and 
		// str points to it.
		
		// str2 ="Aditya" , it looks into the String Constant pool and seragced 
		//for Aditya and is able to locate it.
		
		// str4 = new => it will create a new refernce and str points to it..
		
		if(str==str4){
			//Lets compare String using ==
			System.out.println("str==str4");
			
		}else{
			System.out.println("str!=str4");
			System.out.println("str ::"+str);
			System.out.println("str4 ::"+str4);
		}
		
		// How can we compare the values of two 2 string
		
		if(str.equals(str4)){
			System.out.println("str.equals(str4)");
		}else{
			System.out.println("NOT EQUALS :: str.equals(str4)");
		}
		
		if(str.equalsIgnoreCase(str4)){
			System.out.println("str.equalsIgnoreCase(str4)");
		}else{
			System.out.println("NOT EQUALS :: str.equalsIgnoreCase(str4)");
		}
		
		System.out.println("UPPER CASE FOR STR ::"+str.toUpperCase());
		
		String str5=" Dua";
		System.out.println("Str concats str5 :::"+str.concat(str5));
		String s=str.concat(str5);
		System.out.println(s);
		
		// Search for a substring
		System.out.println(s.substring(2, 8));
		
		//Char at a particular position ::
		System.out.println(s.charAt(8));
		
		
		// Get the length of the String ::
		System.out.println(s.length());
	}

}
