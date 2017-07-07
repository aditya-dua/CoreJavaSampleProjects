package finallydemo.example;

import java.util.Scanner;

/** This example covers : try , catch, finally.
 *  along with : placing multiple catch for one try block.
 * @author AdityaDua
 *
 */


public class DivideExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers : divisor & divident");
		
		n=sc.nextInt();
		x=sc.nextInt();
		// YOu need to close down the instance of your scanner 
		// No matter Exception came or Not . We still have to close 
		//instance....
		
		// cricitcal task => in try nd catch block 
		// We should close the instance or object we have taken...
		// We took the object of Scanner.
		// Imageine I create an Object of Scanner :
		// I us eit and I don't close the object
		// Then in other class I again create the object of Scanner and I work on it a
		// and again I dont close it..
		// We are having in JVM two instances of scanner , which are present 
		// occuping the memory but we are not using it.
		// 15 objects ::: costs ......
		// It is always recommonded to close the instances of 
		// these objects....
		try{
			int quo=divideByNum(n, x);
			System.out.println("The quotient is ::"+quo);
		}catch(ArithmeticException e){
			System.out.println("In division Catch Block");
			//e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("In Exception catch block");
		}finally{
			/** Finally blocks are always executed,no matter , 
			 *  try fails or executes.
			 * 
			 */
			System.out.println("In Finally ! ");
			
		}
		int [] ar={1,2,3,4,5};
		/** its not compulsary to have a catch with try , even 
		 * finally serve the purpose.
		 */
		try{
			System.out.println("Enter the index to be searched");
			x=sc.nextInt();
			System.out.println(fetchFromArray(ar, x));
		}finally{
			System.out.println("In finally of the second try");
			sc.close();
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
