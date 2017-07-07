package abstractdemo2.example;

public class PermanentEmployee extends Employee{

	int id;
	String name;
	String phone;
	
	
	public PermanentEmployee(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The Employee details are :"+name+" "+phone+" "+id );
	}
	

}
