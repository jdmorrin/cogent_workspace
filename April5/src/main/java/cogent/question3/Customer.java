package cogent.question3;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private String name;
	private Reservation rsrv;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Reservation getRsrv() {
		return rsrv;
	}

	@Autowired
	public void setRsrv(Reservation rsrv) {
		this.rsrv = rsrv;
	}

	@Override
	public String toString() {
		return "Customer [rsrv=" + rsrv + "]";
	}
	
}
