package interfacedemo.exmaple;

public class Car implements Vehicle,Manufacturer{

	@Override
	public void canFly() {
		// TODO Auto-generated method stub
		System.out.println("Cars dont fly! unless you are in 2050 and have self driving flying cars");
	
	}

	@Override
	public void noOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("Cars have 4 wheels");
		System.out.println(trial);
	}

	@Override
	public void viewManufacturer() {
		// TODO Auto-generated method stub
		System.out.println(manu[0]+"  "+manu[1]);
	}

}
