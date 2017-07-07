package switchcase.example;

public class SwitchDemo {

	/**
	 * To print month of the year based on the number :::
	 * 1 => Jan
	 * 2=> Feb and so -on
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int monthOfYear;
		monthOfYear=60;
		/**
		 * If any of the value is matched ... it will be in braces and print all 
		 * the possible solutions till a programmer will call break;
		 */
		switch(monthOfYear){
		//monthOfYear == 1 
		case 1 : System.out.println("Jan"); break;
		//monthOfYear == 2 
		case 2 : System.out.println("Feb"); break;
		case 3 : System.out.println("Mar"); break;
		case 4 : System.out.println("Apr"); break;
		case 5 : System.out.println("May"); break;
		case 6 : System.out.println("June");break;
		case 7 : System.out.println("July");break;
		case 8 : System.out.println("Aug"); break;
		case 9 : System.out.println("Sept");break;
		case 10: System.out.println("Oct"); break;
		case 11: System.out.println("Nov"); break;
		case 12: System.out.println("Dec"); break;
		default: System.out.println("The result didnt MATCH");
						break;
		}
		
	}

}
