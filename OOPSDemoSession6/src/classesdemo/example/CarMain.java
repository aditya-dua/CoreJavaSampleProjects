package classesdemo.example;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car Ritz=new Car();
		
		Car M800=new Car(1, "Maruti 800","800 A/C", "Maruti Suzuki",120, 5, 20);
		M800.display();
		M800.changeMaxSpeed(130);
		M800.NumOfGear=6;
		M800.display();
		M800.display("Maruti 800");
		Car Swift=new Car(2, "Maruti Swift","Swift zDi", "Maruti Suzuki",160, 6, 20);
		// Function Calling
		Swift.display();
		
		
	
	}

}
