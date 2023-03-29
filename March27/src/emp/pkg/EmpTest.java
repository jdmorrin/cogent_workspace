package emp.pkg;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Emp emp = new Emp(1001, "Juandi", "Manager", 1500);
			emp.printDET();
		}catch(LowSalException ls) {
			System.out.println(ls.getMessage());
		}

	}

}
