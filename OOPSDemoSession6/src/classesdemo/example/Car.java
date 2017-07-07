package classesdemo.example;

public class Car {
	/**
	 * Data Members
	 */
	int id;
	String name;
	String modelNumber;
	String company;
	int maxSpeed;
	int NumOfGear;
	int average;
	
	/**
	 * Functions :: 
	 * 3 ::: 
	 * declartaion :: public void display();
	 * definition  :: public void display(){...........
	 * 					}
	 * calling     :: display();
	 * 
	 * A function itself is broken down into 3 parts :::
	 * 1. return type ::: what will be the result if execution of function.. 
	 * or what will function return once it is executed..
	 * 2. Parameters  ::: which the caller gives
	 * 3. Access Specifier:: public | private
	 */
	/* This is your function Decalartion & Definition*/
	public void display(){
		System.out.println("The car :"+name+" is having ::: "+id+" and belongs to "+
							company+".Its Model Number as per record is::"+modelNumber+
							".It has "+NumOfGear+" gears and reported a MAx SPeed Of :"+maxSpeed+
							".With a fuel efficency of "+average+" km/l.");
		
	}
	
	public void display(String name){
		System.out.println("The Car's Name is :"+name);
	}
	
	public void changeMaxSpeed(int x){
		System.out.println("Max Speed will be chnaged from "+maxSpeed+" to :"+x);
		maxSpeed=x;
	}
	/**
	 * Parameterized Contructor
	 * @param id
	 * @param name
	 * @param modelNumber
	 * @param company
	 * @param maxSpeed
	 * @param numOfGear
	 * @param average
	 */
	public Car(int id, String name, String modelNumber, String company,
			int maxSpeed, int numOfGear, int average) {
		super();
		this.id = id;
		this.name = name;
		this.modelNumber = modelNumber;
		this.company = company;
		this.maxSpeed = maxSpeed;
		NumOfGear = numOfGear;
		this.average = average;
	}
	/**
	 * Default Constructor
	 */
	public Car() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("In default Contructor");
	}
	/**
	 * Having 2 methods with the same name and different parameters 
	 * is called METHOD OVERLOADING.
	 * So here since the method is a Contructor , we will call it 
	 * CONSTRUCTOR OVERLOADING.
	 */
	
	
	
}
