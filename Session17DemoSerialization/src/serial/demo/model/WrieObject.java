package serial.demo.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WrieObject {

	public static void main(String [] args) throws IOException, ClassNotFoundException{
		
		Employee e = new Employee();
		e.name="Aditya";
		e.phone="882666588";
		e.id=4321;
		e.number=1;
		e.age=35;
		e.weight=82;
		e.height=180;
		
		Salary s = new Salary();
		s.age=25;
		s.name="Employee 1";
		s.sal=12000;
		
		/** File : abc.txt 
		 * .abc
		 * .java
		 * **/
		FileOutputStream fileOut= new FileOutputStream("/Users/AdityaDua/Documents/AcadGild/NewDir/employee.ency");
		
		ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
		//oOut.writeObject(e);
		oOut.writeObject(s);
		
		System.out.println("Data saved in File");
		oOut.close();
		fileOut.close();
		
		FileInputStream fileIn=new FileInputStream("/Users/AdityaDua/Documents/AcadGild/NewDir/employee.ency");
		
		ObjectInputStream oIn=new ObjectInputStream(fileIn);
		
		s=(Salary)oIn.readObject();
		
		System.out.println("Deserialized Object is ::");
		System.out.println("Employee Name :"+s.name);
		//System.out.println("Employee Id :"+s.id);
		//System.out.println("Employee Phone :"+e.phone);
		//System.out.println("Employee Number :"+e.number);
		System.out.println("Employee Age :"+s.age);
		//System.out.println("Employee Height :"+e.height);
		//System.out.println("Employee Weight :"+e.weight);
		System.out.println("Employee Salary :"+s.sal);
	}
}
