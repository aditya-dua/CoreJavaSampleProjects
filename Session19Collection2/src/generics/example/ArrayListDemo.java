package generics.example;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s= new Student("Aditya","1234");
		Student s2= new Student("Aditya1","12341");
		Student s3= new Student("Aditya2","12342");
		
		/** genreics**/
		ArrayList<Student> studentList=new ArrayList<>();
		studentList.add(s);
		studentList.add(s2);
		studentList.add(s3);
		
		for(Student stu:studentList){
			System.out.println("Name :: "+stu.Name);
			System.out.println("Phone ::"+stu.phoneNumber);
		}
		
	}

}
