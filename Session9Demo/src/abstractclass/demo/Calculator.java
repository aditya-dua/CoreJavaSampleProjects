package abstractclass.demo;

public abstract class Calculator {
	/**
	 * In this class method Calculator is Abstract , each class 
	 * extending calculator needs to give its own definition.
	 * 
	 * The method display has been defined in the class and 
	 * can be used directly.
	 */
	
	
	public abstract int calculate();
	
	public void display(double result){
		System.out.println("The result of Operation is ::"+result);
		
	}

}
