package com.example;

public class Synchro {
	
	int bal=1000;
	synchronized void deposit(int amount){
		int temp=bal;
		//bal=bal-amount
		temp=temp+amount;
		try{
			Thread.sleep(2000);
			/** 
			 * Interrrupted Exception :: It will actulaly be invoked :
			 * Whenever the thread is sleeping , or otherwise occuppied 
			 * during those instances there might be sceneros that system might 
			 * need to access the Thread , in such cases we will wake up Thread and 
			 * Thread will result in InterruptedException
			 * 
			 */
		}catch(InterruptedException e){
			System.out.println("In Interuptted Exception");
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		bal=temp;
		System.out.println("The balance is :: "+bal);
		
		
	}

}
