package inheritnace.demo.example;

public class Std9 extends Student{
	
	String cbseEnrolNum;
	int sub1,sub2,sub3,sub4,sub5;
	
	
	public Std9() {
		// TODO Auto-generated constructor stub
		super();
		cbseEnrolNum="";
		sub1=0;
		sub2=0;
		sub3=0;
		sub4=0;
		sub5=0;
		System.out.println("Default Constructor of Std9");
		
//		name="";
//		roll=0;
//		id=0;
//		phoneNo="";
		
	}


	public Std9(String name,String phoneNo,int roll,int id, String cbseEnrolNum, int sub1, int sub2, int sub3, int sub4,
			int sub5) {
		super(roll,id,name,phoneNo);
		this.cbseEnrolNum = cbseEnrolNum;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		System.out.println("Parameterized Constructor of Std9");
	}
	
	public void display(){
		System.out.println("The Class 9 Student entered are ::");
		super.display();
		/*System.out.println("Name :::::::::::::::::::::::::::::"+ name);
		System.out.println("Roll :::::::::::::::::::::::::::::"+ roll);
		System.out.println("Id :::::::::::::::::::::::::::::::"+ id);
		System.out.println("Phone Number :::::::::::::::::::::"+ phoneNo);
		*/System.out.println("CBSE :::::::::::::::::::::::::::::"+ cbseEnrolNum);
		System.out.println("sub1 :::::::::::::::::::::::::::::"+ sub1);
		System.out.println("sub2 :::::::::::::::::::::::::::::::"+ sub2);
		System.out.println("sub3 :::::::::::::::::::::::::::::"+ sub3);
		System.out.println("sub4 :::::::::::::::::::::::::::::::"+ sub4);
		System.out.println("sub5 :::::::::::::::::::::::::::::::"+ sub5);
		
	}

}
