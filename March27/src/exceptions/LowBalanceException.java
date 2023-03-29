package exceptions;

public class LowBalanceException extends Exception{
	public LowBalanceException() {
		super("You have low funds in your accounts");
	}
}
