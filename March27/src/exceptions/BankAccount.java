package exceptions;

public class BankAccount extends Exception{
	int accNo;
	String customerName;
	String accType;
	float balance;
	
	public BankAccount(int accNo, String customerName, String accType, float balance) {
		this.accNo = accNo;
		this.customerName = customerName;
		this.accType = accType;
		
//		if(balance < 0)
//			throw new NegativeAmount("Cannot make an account with a negative amount");
//		if(
//				(this.accType.equals("Savings") && this.balance >= 1000) 
//				|| (this.accType.equals("Current") && this.balance >=5000)
//			) {
//			throw new LowBalanceException();
//		}
		
		this.balance = balance;
		
	}
	
	public float getBalance() {
		return this.balance;
	}
	
	public void deposit(float amt) throws NegativeAmount{
		if(amt < 0)
			throw new NegativeAmount("Cannot deposit a negative amount of money into bank");
		else {
			this.balance += amt;
		}
	}
	
	public void withdraw(float amt) throws InsufficientFunds{
		if(
			(this.accType.equals("Savings") && this.balance >= 1000) 
			|| (this.accType.equals("Current") && this.balance >=5000)
		) {
			this.balance -= amt;
			
		}else { throw new InsufficientFunds("Insufficient funds. Cannot withdraw");}
	}
	
}
