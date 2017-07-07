package custom.exception.example;

public class BankAccount {

	/** 4 variables....*/
	
	int balance;
	int accountNo;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
		accountNo=0;
		balance=0;
	}
	BankAccount(int bal,int num){
		balance=bal;
		accountNo=num;
		
	}
	public void deposit(int amount){
		balance=balance+amount;
		System.out.println("Money depositted Successfully."+balance);
	}
	public void withdraw(int amount) throws InsufficentBalanceException{
		if(balance-amount<0){
			/* CHECKED EXCPETION*/
			throw new InsufficentBalanceException("Withdrawal failure is you have Insufficent balance. Your balance is Rs."+amount);
		}
		else{
			balance=balance-amount;
			System.out.println("Money Withdrawan:: Avail. Bal. Rs"+balance);
		}
	}
}
