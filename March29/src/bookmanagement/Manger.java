package bookmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Book> books = new ArrayList<>();
		BookDAOImp dao = new BookDAOImp(books);
		Scanner s = new Scanner(System.in);
		
		int choice;
		do {
			
			System.out.println("***MENU***");
			System.out.println("1. Add book");
			System.out.println("2. Update book");
			System.out.println("3. Find book");
			System.out.println("4. Delete book");
			System.out.println("5. Print all books");
			System.out.println("6. Exit");
			choice = s.nextInt();
			
			switch(choice) {
			case 1:
				dao.create();
				break;
			case 2:
				dao.update();
				break;
			case 3:
				dao.find();
				break;
			case 4:
				dao.delete();
				break;
			case 5:
				dao.printAll();
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				break;
			}
			
		}while(choice != 6);
		

	}

}
