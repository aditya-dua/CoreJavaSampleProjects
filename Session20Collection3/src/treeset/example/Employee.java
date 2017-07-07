package treeset.example;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	String phone;
	
	public Employee(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(id>o.id){
			return 1;
		}else if(id<o.id){
			return -1;
		}else{
			return 0;
		}
	}
	
	
	
}
