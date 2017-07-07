package interfacedemo.exmaple;

public class InterfaceMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c= new Car();
		c.canFly();
		c.noOfWheels();
		c.viewManufacturer();
		
		
		Areoplane ar= new Areoplane();
		ar.canFly();
		ar.noOfWheels();
		
		Cycle cy = new Cycle();
		cy.canFly();
		cy.noOfWheels();
	}

}
