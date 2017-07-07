package staticexample.demo;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		System.out.println(c.id+"  "+c.engineNo+" "+c.manufacturer);
		System.out.println("Car.manufacturer :: "+Car.manufacturer);
		
		Car c2=new Car();
		System.out.println(c2.id+"  "+c2.engineNo+" "+c2.manufacturer);
		c2.manufacturer="Hyundai";
		System.out.println("USING C VALI CAR :::"+c.id+"  "+c.engineNo+" "+c.manufacturer);
		System.out.println("Car.manufacturer :: "+Car.manufacturer);
	
	}

}
