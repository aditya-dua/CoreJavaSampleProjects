package staticexample.demo;

public class Car {
	int id;
	int engineNo;
	static String manufacturer;
	
	Car(){
		id=10;
		engineNo=100;
		manufacturer="Maruti";
	}
	/** 
	 * This is Parameterized , it can have any number of arguments.
	 * If you define the parameterized constructor then you also need to define 
	 * the default one , otherwise the compiler will give an error once the default is called
	 * 
	 * 
	 * @param a  => Passed from Main Class refers to Id of the car
	 * @param b  => Passed from Main Class , refers to the engine No of the Car
	 * 
	 */
	Car(int a, int b){
		id=a;
		engineNo=b;
	}

}
