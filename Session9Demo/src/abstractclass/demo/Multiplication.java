package abstractclass.demo;

import java.util.Scanner;

public class Multiplication extends Calculator{

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		int a,b,product;
		System.out.println("Enter the two Numbers ::");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		product=a*b;
		
		return product;
	}

}
