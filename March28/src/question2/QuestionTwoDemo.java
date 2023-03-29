package question2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class QuestionTwoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Serialization
		Scanner s = new Scanner(System.in);
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		System.out.println("Would you like to write into the file [y/n]?");
		char choice = s.nextLine().charAt(0);
		if(choice == 'y') {
			do {
				try {
					int roll, age;
					String name, addr;
					
					fos = new FileOutputStream("records.ser", true);
					oos = new ObjectOutputStream(fos);
					
					System.out.println("Enter record roll number: ");
					roll = Integer.parseInt(s.nextLine());
					System.out.println("Enter record name: ");
					name = s.nextLine();
					System.out.println("Enter record age: ");
					age = Integer.parseInt(s.nextLine());
					System.out.println("Enter record address: ");
					addr = s.nextLine();
					
					Record rec = new Record(roll, name, age, addr);
					oos.writeObject(rec);
					System.out.println("Object created and serialized");
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				
				System.out.println("Write another record[y/n]?");
				choice = s.nextLine().charAt(0);
			}while(choice != 'n');
		}
		
		// Deserialization
		System.out.println("\n\nDisplaying all records");
		try {
			FileInputStream fis = new FileInputStream("records.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			while(true) {
				Object obj = ois.readObject();
				Record recordOut = (Record)obj;
				
				System.out.println("Record roll number: " + recordOut.rollNo);
				System.out.println("Record name: " + recordOut.name);
				System.out.println("Record age: " + recordOut.age);
				System.out.println("Record address: " + recordOut.addr);
			}
		
//			for(;;) {
//				Object obj = ois.readObject();
//				Record recordOut = (Record)obj;
//				
//				System.out.println("Record roll number: " + recordOut.rollNo);
//				System.out.println("Record name: " + recordOut.name);
//				System.out.println("Record age: " + recordOut.age);
//				System.out.println("Record address: " + recordOut.addr);
//				
//			}
			
//			Object obj = ois.readObject();
//			Record recordOut = (Record)obj;
//			
//			System.out.println("Record roll number: " + recordOut.rollNo);
//			System.out.println("Record name: " + recordOut.name);
//			System.out.println("Record age: " + recordOut.age);
//			System.out.println("Record address: " + recordOut.addr);
			
			//fis.close();	// code bcomes unreachable when using the for loop
			//ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			fis.close();
			ois.close();
		}
		
		
		

	}

}
