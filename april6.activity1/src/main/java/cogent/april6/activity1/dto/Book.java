package cogent.april6.activity1.dto;

import java.util.Scanner;

public class Book {
	private int id;
	private String name;
	private String author;
	private double price;
	
	public Book() {
//		Scanner s = new Scanner(System.in);
//		Scanner ss = new Scanner(System.in);
//		System.out.println("In constructor...");
//		System.out.println("Enter book details:");
//		System.out.println("id: ");
//		this.setId(s.nextInt());
//		System.out.println("name: ");
//		this.setName(ss.nextLine());
//		System.out.println("author: ");
//		this.setAuthor(ss.nextLine());
//		System.out.println("price: ");
//		this.setPrice(s.nextDouble());
		//System.out.println("I am inside the costructor");
		
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	

}
