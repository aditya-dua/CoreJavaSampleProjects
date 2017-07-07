package custom.exception.example;

public class AccountMain {

	public static void main(String[] args) throws InsufficentBalanceException {
		// TODO Auto-generated method stub

		BankAccount Nitish=new BankAccount(1000,1);
		BankAccount Pallav = new BankAccount(10000,2);
		BankAccount Vamshi = new BankAccount(500,2);
		BankAccount Bhawani = new BankAccount(5000,2);
		
		Nitish.deposit(1000);
		Pallav.deposit(500);
		Vamshi.deposit(1000);
		Bhawani.deposit(5000);
		
		//try{
			Nitish.withdraw(3000);
		/*}catch(InsufficentBalanceException e){
			System.err.println("Insufficent Balance :: ");
		}*/
	}

}
