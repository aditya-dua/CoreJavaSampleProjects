package serial.demo.model;

import java.io.Serializable;


@author(name="Aditya", client= "Acadgild", LastModifiedBy ="ABC")
public class Employee extends Person implements Serializable{

	String name;
	String phone;
	int id;
	transient int number;
	
	
	
	
	
}
