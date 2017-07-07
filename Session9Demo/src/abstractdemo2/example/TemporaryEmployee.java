package abstractdemo2.example;

public class TemporaryEmployee extends Employee{

	String name;
	String phone;

	public TemporaryEmployee(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The details of Employee are ::"+name+"  "+phone);
	}

}
