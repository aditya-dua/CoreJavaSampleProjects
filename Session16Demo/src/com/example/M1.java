package com.example;

public class M1 extends Thread{

	Synchro s;
	M1(Synchro s){
		this.s=s;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		s.deposit(1000);
	}
}
