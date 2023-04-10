package cogent.autowire;

public class Person {
	Car car;
	Address addr;
	
	public Person(Car car, Address addr){
		super();
		this.addr = addr;
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [car=" + car + ", addr=" + addr + "]";
	}
	
	
}
