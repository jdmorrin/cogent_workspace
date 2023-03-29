package question2;

import java.io.Serializable;

public class Record implements Serializable{
	int rollNo;
	String name;
	int age;
	String addr;
	
	public Record(int rollNo, String name, int age, String addr) throws BlankInputException, NotNumericalValueException{
		super();
		
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
