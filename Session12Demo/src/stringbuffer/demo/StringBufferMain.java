package stringbuffer.demo;

public class StringBufferMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To make a StringBuffer from a  string::: 
		StringBuffer strbuf=new StringBuffer("Aditya");
		
		// To make Stringbuffer from Char Sequence..
		StringBuffer strbuf2=new StringBuffer('a');
		
		// whenever we create a StringBuffer it will create a SB type object 
		// with default size of 16 ...
		
		StringBuffer strbuf3=new StringBuffer(4);
		
		System.out.println(strbuf3.capacity());
		System.out.println(strbuf.capacity());
		StringBuffer strbuf4=new StringBuffer();
		System.out.println(strbuf4.capacity());
		
		strbuf.append(" Dua");
		System.out.println(strbuf);
		strbuf.delete(0, 4);
		System.out.println(strbuf);
		
	}

}
