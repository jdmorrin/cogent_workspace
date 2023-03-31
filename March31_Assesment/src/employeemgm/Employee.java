package employeemgm;

import java.util.Scanner;

public class Employee implements Comparable<Employee>{
	int no;
	String name;
	String addr;
	String email;
	double salary;
	
	public Employee() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter employee number: ");
		this.no = s.nextInt();
		System.out.println("Enter name: ");
		this.name = s.next();
		System.out.println("Enter address: ");
		this.addr = s.next();
		System.out.println("Enter email: ");
		this.email = s.next();
		System.out.println("Enter salary: ");
		this.salary = s.nextDouble();
	}
	
	public Employee(int no, String name, String addr, String email, double salary) {
		this.no = no;
		this.name = name;
		this.addr = addr;
		this.email = email;
		this.salary = salary;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee: " + this.name + "\t" + this.no + "\t" + this.addr + "\t"+this.email+"\t"+this.salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
}
