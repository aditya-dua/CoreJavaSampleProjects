package treeset.example;

import java.util.TreeSet;

public class TreeSetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Employee> tsEmp=new TreeSet<>();
		Employee e= new Employee(1, "Aditya", "12345");
		Employee e1= new Employee(2, "Aditya1", "123456");
		Employee e2= new Employee(1, "Aditya4", "123459");
		Employee e4= new Employee(4, "Aditya4", "123459");
		
		tsEmp.add(e);
		tsEmp.add(e1);
		tsEmp.add(e2);
		tsEmp.add(e4);
		
		
		for (Employee employee : tsEmp) {
			System.out.println("ID ::"+employee.id);
			System.out.println("Name ::"+employee.name);
			System.out.println("Phone ::"+employee.phone);
			
		}
		
	}

}
