package exception.demo;

import java.util.Scanner;

public class DivideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers : divisor & divident");
		n=sc.nextInt();
		
		x=sc.nextInt();
		int [] ar={1,2,3,4,5};
		try{
			int quo=divideByNum(n, x);
			System.out.println("The quotient is ::"+quo);
		}catch(ArithmeticException e){
			System.out.println("In division Catch Block");
			//e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("In Exception catch block");
		}
		
		
		
		
		try{
			System.out.println("Enter the index to be searched");
			x=sc.nextInt();
			System.out.println(fetchFromArray(ar, x));
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Array Index is wrong");
			
		}
		
		
		
	}
	
	public static int divideByNum(int n,int x){
		// dividebyZEro
		
		return n/x;
	}
	
	public static int fetchFromArray(int[] ar,int x){
		return ar[x];
	}
	

}
