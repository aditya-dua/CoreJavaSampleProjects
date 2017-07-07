package runnable.demo;

/*
 * SO we are making the Thread1 which is implementing the runnable Interface 
 * Interface you have a method run() to be overridden
 * 
 * we override the run() method...
 * we are using a method of the thread class :: Thread.currentThread() => this keyword for the current thread
 * If How can we identify if CurrentThread() is static ?
 * Ans : in italics 
 * Logical : since this is method can be called directly on the className and doesnot neds the Object of the thread to call it 
 * that is why it is a static method ?
 * 
 */
public class Thread1 implements Runnable{

	/**
	 * run is the method which is to be overridden when making threads. 
	 * 
	 * the logic is always written in the run() method.
	 * you call the run() nethod???????? ThreadObject.start() => calls the run method
	 * 
	 * 
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equals("Withdraw")){
			withdrarMoney(1000);
		}
		else if(Thread.currentThread().getName().contains("balance")){
			displaybalnace();
		}
		
		if(Thread.currentThread().getName().equals("Thread1")){
			System.out.println("No for will be executed");
		}
		else{
			for(int i=0;i<10;i++){
				System.out.println("For "+i+"  "+Thread.currentThread().getName());
			}
		}
		

	}
	
	public void withdrarMoney(int amount){
		System.out.println("In Withdraw money");
	}
	public void displaybalnace(){
		
	}

}
