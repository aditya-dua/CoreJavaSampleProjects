package arrays.demo;

import java.util.Scanner;

public class OneDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sub=new int[5];
		int sum=0;
		float percent;
		
		Scanner sc = new Scanner(System.in);
		// array.length : will return you the length of the array.
		System.out.println("Pelase input subject marks ::");
		for(int i=0;i<sub.length;i++){
			sub[i]=sc.nextInt();
			
		}
		System.out.println("The SUbject marks entered are ::");
		for(int i=0;i<sub.length;i++){
			System.out.print(" "+sub[i]+"  :: ");
			sum=sum+sub[i];
		}
		percent=sum/5;
		System.out.println("The percentage is ::" + percent);
		
	}

}
