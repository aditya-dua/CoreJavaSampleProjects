package abstractdemo2.example;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PermanentEmployee abc=new PermanentEmployee(1,"ABC","123456789");
		abc.display();
		
		TemporaryEmployee ram=new TemporaryEmployee("Ram","12345");
		ram.display();
	}

}
