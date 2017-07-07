package ifelseif.example;

import java.util.Scanner;

public class NestedElseIf {

	/**
	 * Find the Laergest Of 3 Nunbers :::
	 * why System.in ? Please remind me tommorrow 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 3 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1>num2){
			if(num1>num3){
				System.out.println(num1+" is Largest Of All ! ");
			}
			else{
				System.out.println(num3+" is Largest Of All ! ");
			}
		}else if(num2>num1){
			if(num2>num3){
				System.out.println(num2+" is Largest Of All ! ");
			}
			else{
				System.out.println(num3+" is Largest Of All ! ");
			}
		}
		
		
	}

}
