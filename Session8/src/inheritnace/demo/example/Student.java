package inheritnace.demo.example;

public class Student {
	
	String name;
	int roll;
	int id;
	String phoneNo;
	
	/** Constructor Overloading**/
	Student(){
		name="";
		roll=0;
		id=0;
		phoneNo="";
		System.out.println("Default Constructor Of Student Ended");
	}
	
	Student(int roll,int id,String name,String phoneNo){
		this.roll=roll;
		this.id=id;
		this.name=name;
		this.phoneNo=phoneNo;
		System.out.println("Parameterized Constructor Of Student Ended");
	}
	/**Creating the diaplay method**/
	public void display(){
		System.out.println("The Student details entered are ::");
		System.out.println("Name :::::::::::::::::::::::::::::"+ name);
		System.out.println("Roll :::::::::::::::::::::::::::::"+ roll);
		System.out.println("Id :::::::::::::::::::::::::::::::"+ id);
		System.out.println("Phone Number :::::::::::::::::::::"+ phoneNo);
		
	}
	
}
