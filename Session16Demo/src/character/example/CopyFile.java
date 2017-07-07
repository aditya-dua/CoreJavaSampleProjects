package character.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileOutputStream out =null;
		
		FileInputStream in = new FileInputStream("inputtext.txt");
		FileOutputStream out=new FileOutputStream("output.txt");
		
		int c;
		while((c=in.read())!=-1){
			out.write(c);
			System.out.print(c);
		}
		
		in.close();
		out.close();
		
		
	}

}
