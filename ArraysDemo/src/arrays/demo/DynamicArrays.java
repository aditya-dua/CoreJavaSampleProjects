package arrays.demo;

import java.util.Scanner;

public class DynamicArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		Scanner sc = new Scanner(System.in);
		
		int k=sc.nextInt();
		
		if(k<0){
			System.out.println("Not Possible");
		}else{
			a=new int[k];
			for(int i=0;i<a.length;i++){
				a[i]=(int)Math.random();
				//a[i]=i*10+i;
				System.out.println(a[i]);
			}
			
		}
		
	}

}
