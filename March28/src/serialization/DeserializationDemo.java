package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Employee emp = (Employee)obj;
			
			System.out.println("Employee ID: " + emp.id);
			System.out.println("Employee name: " + emp.name);
			System.out.println("Employee salary: " + emp.salary);
			System.out.println("Employee ssn: " + emp.ssn);
			
			fis.close();
			ois.close();
		}catch(Exception e) {
			
		}
		

	}

}
