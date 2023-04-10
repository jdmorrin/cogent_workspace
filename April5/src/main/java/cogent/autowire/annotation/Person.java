package cogent.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;


public class Person {
	private Car car;

	public Car getCar() {
		return car;
	}

	@Autowired
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [car=" + car + "]";
	}
	
}
