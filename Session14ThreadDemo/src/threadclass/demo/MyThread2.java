package threadclass.demo;

public class MyThread2 extends Thread{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=10;i<20;i++){
			System.out.println(currentThread().getName()+" "+i);
		}
		
	}
}
