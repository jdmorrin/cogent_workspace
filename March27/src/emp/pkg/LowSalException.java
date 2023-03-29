package emp.pkg;

public class LowSalException extends Exception{
	public LowSalException() {
		super("Your basic salary is too low");
	}
}
