package threadclass.demo;

public class ThreadMain {

	
	public static void main(String[] args) {
		
		
		/** 
		 * Lic / IcIcI Bank / Bank Of Barorda ..
		 * Use Case : 
		 * tabloid banking::: It says that inspite of your executive carrying
		 * hard copy of forms , let him carry the tablet , which will have the form 
		 * and he will click the live image of of the person and upload 
		 * all the documents..
		 * 
		 * The image of Documents is clicked , is to be circulated atleast to 
		 * 5 users....
		 * 1. Bank DB 
		 * 2. Bank Server or remote backup
		 * 3. Bank Branch 
		 * 4. Customer Application
		 * Whenever say you upload a DL. 
		 * UPload is done in the thread(UI)..
		 * In the backend , we start 5 services (thread) which will 
		 * 1. thread will submit your image to the server 
		 * 2. will attach it to your application and so-on...
		 * 
		 * we want to attach an image it should not take more than 1.3 secs..
		 * meta data : 
		 * 
		 * **/
		MyThread1 t1=new MyThread1();
		t1.setName("Thread1");
		
		//t1.h
		MyThread2 t2= new MyThread2();
		t2.setName("Thread2");
		
		t1.start();
		t2.start();
	}
}
