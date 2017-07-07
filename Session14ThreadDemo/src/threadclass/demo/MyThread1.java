package threadclass.demo;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println(currentThread().getName()+" "+i);
		}
		
	}
}
