package runnable.demo;

public class ThreadMain {

	/** 
	 * 4 Constructors: 
	 * Thread() => yesterday
	 * Thread(RunnableInterface) 
	 * @param args
	 */
	
	/*
	 * 
	 * There is a beauty about the runnable interface ??
	 * that is it can have any number of thread objects..
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 runnable1=new Thread1();
		
		Thread withdraw = new Thread(runnable1);
		withdraw.setName("Withdraw");
		withdraw.start();
		Thread t=new Thread(runnable1);
		t.setName("Thread1");
		
		Thread t2=new Thread(runnable1);
		t2.setName("Thread2");
		
		t.start();
		t2.start();
		
		Thread t3=new Thread(runnable1, "Thread 3 :: runnable1");
		
		
	}

}
