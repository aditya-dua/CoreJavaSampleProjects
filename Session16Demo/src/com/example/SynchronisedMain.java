package com.example;

public class SynchronisedMain {

	public static void main(String[] args) {
		
		Synchro s=new Synchro();
		M1 m = new M1(s);
		m.start();
		/* it is bassically a user thread and jvm will not terminate 
		 * the programe once this is executing
		 * .setDaemon()
		 *  */
	
		 
		m.setDaemon(true);
		M2 m2= new M2(s,m);
		m2.start();
		
		
	}
}
