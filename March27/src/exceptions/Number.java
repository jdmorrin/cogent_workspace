package exceptions;

public class Number extends ArithmeticException{
	int x;
	int y;
	double result;
	
	public Number(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void add() {
		this.setResult(this.getX() + this.getY());
	}
	
	public void sub() {
		this.setResult(this.getX() - this.getY());
	}
	
	public void mul() {
		this.setResult(this.getX() * this.getY());
	}
	
	public void div() throws ArithmeticException{
		if(this.getY() == 0)
			throw new ArithmeticException("Cannot divide by 0");
		this.setResult(this.getX() / this.getY());
	}
}
