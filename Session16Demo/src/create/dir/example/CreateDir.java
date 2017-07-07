package create.dir.example;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Linux : each folder is also a file : even directory is an executable file **/
		
		String dirname="/Users/AdityaDua/Documents/AcadGild/NewDir2/New2/AG2";
		
		File f = new File(dirname);
		f.mkdirs();
		
	}

}
