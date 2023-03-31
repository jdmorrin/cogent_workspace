package employeemgm;

import java.util.List;
import java.util.Scanner;

public class EmpDAOImp implements EmpDAO{

	@Override
	public void create(List <Employee> l) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		l.add(emp);
	}

	@Override
	public Employee search(List <Employee> l) {
		System.out.println("Enter an employee number: ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.println("Looking for employee...");
		
		for(Employee n : l) {
			if(n.no == x)
				return n;
		}
		return null;
		
	}

	@Override
	public void update(List <Employee> l) {
		Employee old = search(l);
		
		System.out.println("Replacing employee... " + old);
		Employee newEmp = new Employee();
		
		l.set((l.indexOf(old)), newEmp);
	}

	@Override
	public void delete(List <Employee> l) {
		// TODO Auto-generated method stub
		Employee del = search(l);
		
		System.out.println("Deleting employee... " + del);
		l.remove(l.indexOf(del));
		
	}
	
	@Override
	public void printAll(List <Employee> l) {
		for(Employee e : l) {
			System.out.println(e);
		}
	}
	
}
