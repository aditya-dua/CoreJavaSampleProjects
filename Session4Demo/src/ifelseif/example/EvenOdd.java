package ifelseif.example;

import java.util.Scanner;

public class EvenOdd {

	/**
	 * What is psvm why we call it like so ?
	 * Classes & Objects...
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		i=sc.nextInt();
		
		if(i%2==0){
			System.out.println(i+" is EVEN");
			
		}else{
			System.out.println(i+" is ODD");
		}
		
		
	}

}
