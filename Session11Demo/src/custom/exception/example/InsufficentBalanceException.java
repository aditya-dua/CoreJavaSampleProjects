package custom.exception.example;

/** by extedning the class Exception , you can make your class as Exception */


public class InsufficentBalanceException extends Exception {

	String message;
	
	public InsufficentBalanceException() {
		// TODO Auto-generated constructor stub
		System.out.println("Exception Constructor Called");
	}
	public InsufficentBalanceException(String message){
		this.message=message;
		System.out.println("Exception thrown with message"+getMessage());
		printStackTrace();
	}
	public String getMessage() {
		return message;
	}
}
