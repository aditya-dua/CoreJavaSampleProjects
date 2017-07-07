package bytestream.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// any idea how are images ...
		// aaray of bytes in Java 
		
		ByteArrayOutputStream bOutput=new ByteArrayOutputStream(12);
		
		while(bOutput.size()!=10){
			// Read a byte from user 
			bOutput.write(System.in.read());
		}
		
		byte  b[]= bOutput.toByteArray();
		
		
		System.out.println("Print the content below");
		
		for(int i=0;i<b.length;i++){
			System.out.print((char)b[i]+" ");
		}
		System.out.println(" ");
		
		/** Input Stream **/
		/** 1. You create the input Stream Object on the array of bytes.
		 	2. YOu can simply read it from input Stream using : .read()
		 **/
		/** Wrapper Classes  : A class which is wrapped around a primitive datatype ..
		 * because it is important to perform the operations on the data type..
		 * Everything (I/O) is in the form of Strings..
		 * Say I want to input the int 
		 * 
		 * Integer.parseInt(String)
		 **/
		int ch;
		ByteArrayInputStream bInput=new ByteArrayInputStream(b);
		
		for(int y=0;y<1;y++){
			while((ch =bInput.read())!=-1){
				System.out.print(Character.toUpperCase((char)ch));
				
			}
		}
		
	}

}
