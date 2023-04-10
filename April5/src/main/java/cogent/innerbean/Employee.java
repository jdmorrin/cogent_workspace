package cogent.innerbean;

public class Employee {
	private int id;
	private Address addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", addr=" + addr + "]";
	}
	
}
