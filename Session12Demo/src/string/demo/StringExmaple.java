package string.demo;

public class StringExmaple {

	public static void main(String[] args) {
		
		String str ="Aditya";
		System.out.println(str);
		
		String str2=str;
		
		// Both are pointing to the same refernce.
		// Some where in memory I am having : Aditya which is stored at : 1956490294
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		str="Ram";
		// 1. Values will change for both : str & str2 => we can not chng the value which we declare earlier
		// 2. Values will change for str & str2 will point to a new location => we can not chng the value which we declare earlier
		// 3. It will create a new object of String "Ram" and Str will point to it. :: CORRECT 
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		// How to create a String :: can be checked by the constructors you are having to create the String.
		String string = new String("Aditya Dua");
		
		
	}
}
