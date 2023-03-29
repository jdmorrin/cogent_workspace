package question2;

public class NotNumericalValueException extends Exception{
	public NotNumericalValueException() {
		super("This value must be a number");
	}
}
