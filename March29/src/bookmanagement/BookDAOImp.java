package bookmanagement;

import java.util.List;
import java.util.Scanner;

public class BookDAOImp implements BookDAO{
	List <Book> books;
	Scanner s = new Scanner(System.in);
	
	public BookDAOImp(List <Book> books) {
		this.books = books;
	}
	
	public void create() {
//		Scanner s = new Scanner(System.in);
		int id;
		String name;
		double price;
		
		System.out.println("Enter book id: ");
		id = s.nextInt();
		System.out.println("Enter book title: ");
		name = s.next();
		System.out.println("Enter book price: ");
		price = s.nextDouble();
		
		Book book = new Book(id, name, price);
		
		this.books.add(book);
		//s.close();
	}
	
	public void find() {
		int i;
		System.out.println("Enter an index: ");
		i = s.nextInt();
		System.out.println(this.books.get(i));
	}
	
	public void delete() {
		int i;
		System.out.println("Enter an index: ");
		i = s.nextInt();
		System.out.println(this.books.get(i) + " has been deleted");
		this.books.remove(i);
		
	}
	
	public void update() {
		int i;
		System.out.println("Enter an index: ");
		i = s.nextInt();
		
		int id;
		String name;
		double price;
		
		System.out.println("Enter book id: ");
		id = s.nextInt();
		System.out.println("Enter book title: ");
		name = s.next();
		System.out.println("Enter book price: ");
		price = s.nextDouble();
		
		Book book = new Book(id, name, price);
		this.books.set(i, book);
	}
	
	public void printAll() {
		int i = 0;
		for(Book b : this.books) {
			System.out.println(i + ": " + b);
			i++;
		}
	}
	
}
