package com.example;

public class M2 extends Thread{

	Synchro s;
	M1 m;
	
	
	public M2(Synchro s, M1 m) {
		super();
		this.s = s;
		this.m = m;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		s.deposit(500);
		
	}
	
	
}
