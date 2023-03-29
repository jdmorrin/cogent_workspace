package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("emp.ser");
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(1001, "Juan", 10000, 12345);
			oos.writeObject(emp);
			System.out.println("Object serialized.");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
