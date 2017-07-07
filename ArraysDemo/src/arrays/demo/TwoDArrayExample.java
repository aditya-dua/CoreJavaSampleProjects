package arrays.demo;

import java.util.Scanner;

public class TwoDArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] student=new String[3][3];
	//	it will have name , course and subject of each student....
		
		Scanner sc = new Scanner(System.in);
		//student[0]
		for(int i=0;i<student.length;i++){
			
			for(int j=0;j<student[i].length;j++){
				student[i][j]=sc.nextLine();
			}
		}
		for(int i=0;i<student.length;i++){
			
			for(int j=0;j<student[i].length;j++){
				System.out.print(student[i][j]+"    ");
			}
			System.out.println();
		}
	}

}
