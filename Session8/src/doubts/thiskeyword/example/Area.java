package doubts.thiskeyword.example;

public class Area {
	
	final double pie=3.14;
	// All those variable whose values are limited to the object of class 
	//and for each Object(Instance) we have a different variable is called Instance Variable.
	
	double area;
	
	// Class Variables are the one , which are common for a class & for all the instances of the class.
	static int a;
	
	/**
	 * Method Overloading : calcArea is being overloaded
	 * @param radius
	 */
	public void calcArea(int radius){
		area=pie*radius*radius;
		System.out.println("The Area of Circle :"+area);
	}
	
	public void calcArea(int length,int breadth){
		area=length*breadth;
		System.out.println("The Area of Rectangle is ::"+area);
	}
	/*CONSTRUCTOR*/
	public Area(double area){
		/** Two instances of area variable :: 
		 * 1. Formal Argument : The ones which are passed in the aruguments of the function are called 
		 * 2. Instance Variable : The Ones which are created with the object of the class
		 * Two variables with the same name then the local variable within that 
		 * braces gets the prefrence.
		 * area is from class
		 * public class AreaMain{
		 * psvm(){
		 * 	Area a=new Area(10);
		 *  Area ab=new Area(5);
		 * }
		 * }
		 * 
		 */
		System.out.println("The Object is printed using this "+this);
		this.area=area;
		this.calcArea(10);
		this.calcArea(10, 15);
		
	}
	

}
