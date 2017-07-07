package interfacedemo.exmaple;

public class Areoplane implements Vehicle{

	@Override
	public void canFly() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplanes Can FLy");
	}

	@Override
	public void noOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("Wheels in aeroplane vary from 5");
	}

}
