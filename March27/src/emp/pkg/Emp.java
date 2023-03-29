package emp.pkg;

public class Emp {
	int id;
	String name;
	
	
	String designation;
	double basic;
	final double hra;//foo();// calculateHRA();
	
	public Emp(int id, String name, String designation, double basic) throws LowSalException{
		this.id = id;
		this.name = name;
		this.designation = designation;
		
		hra = calculateHRA();
		
		if(basic < 500)
			throw new LowSalException();
		this.basic = basic;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public void printDET() {
		System.out.println("***Employee details***");
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Designation: " + getDesignation());
		System.out.println("Basic: " + getBasic());
		System.out.println("HRA: " + hra);
	}
	
	public double calculateHRA() {
		double num = 0;
		if(this.designation.equals("Manager")) {
			num = 0.1 * getBasic();
		}
		else if(this.designation.equals("Officer")) {
			num = 0.12 * getBasic();
		}
		else if(this.designation.equals("Clerk")) {
			num = 0.05 * getBasic();
		}
	
		return num;
	}
	

//	public double foo() {
//		double num = 32;
//		return num;
//	}
	
}
