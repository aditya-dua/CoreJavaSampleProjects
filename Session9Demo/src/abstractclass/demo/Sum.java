package abstractclass.demo;

import java.util.Scanner;

public class Sum extends Calculator{

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		int a,b,sum;
		System.out.println("Enter the two Numbers ::");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		return sum;
	}
	

}
