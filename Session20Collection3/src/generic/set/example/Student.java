package generic.set.example;

public class Student {

	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.age=age;
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s= (Student) obj;
		if(this.id==s.id){
			return true;
		}else{
			return false;
		}
		
		//return super.equals(obj);
	}
}
