package question2;

public class BlankInputException extends Exception{
	public BlankInputException() {
		super("Blank inputs are not allowed");
	}
}
