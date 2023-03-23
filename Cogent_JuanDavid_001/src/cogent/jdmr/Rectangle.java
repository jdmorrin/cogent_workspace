package cogent.jdmr;

public class Rectangle {
	private float len;
	private float bre;
	
	public Rectangle() {
		this.len = 0;
		this.bre = 0;
	}
	
	public Rectangle(int len, int bre) {
		this.len = len;
		this.bre = bre;
	}

	public float getLen() {
		return len;
	}

	public void setLen(float len) {
		this.len = len;
	}

	public float getBre() {
		return bre;
	}

	public void setBre(float bre) {
		this.bre = bre;
	}
	
	public float area(float len, float bre) {
		
		return len * bre;
	}

	@Override
	public String toString() {
		return "length=" + this.getLen() + "\nbreadth=" 
				+ this.getBre() + "\narea=" 
				+ area(this.getLen(), this.getBre());
	}
	
	
}
