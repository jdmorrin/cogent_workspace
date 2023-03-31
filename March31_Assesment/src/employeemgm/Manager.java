package employeemgm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> emps = new ArrayList<>();
		EmpDAO dao = new EmpDAOImp();
		int c;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("\n***MENU***");
			System.out.println("1.Create employee");
			System.out.println("2. Update employee");
			System.out.println("3. Delete Employee");
			System.out.println("4 .Read all");
			System.out.println("5. Search employee");
			System.out.println("6. Sort by name");
			System.out.println("7. Exit");
			
			c = s.nextInt();
			switch (c){
			case 1:
				dao.create(emps);
				break;
			case 2:
				dao.update(emps);
				break;
			case 3:
				dao.delete(emps);
				break;
			case 4:
				dao.printAll(emps);
				break;
			case 5:
				//System.out.println("Employee data: ");
				System.out.println(dao.search(emps));
				break;
			case 6:
				emps.sort(null);
				break;
			case 7:
				break;
			}
			
			
		}while (c != 7);
		
		
	}

}
