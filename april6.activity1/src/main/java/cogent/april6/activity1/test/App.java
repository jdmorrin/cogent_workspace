package cogent.april6.activity1.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.jdbc.Driver;

import cogent.april6.activity1.dao.BookDao;
import cogent.april6.activity1.dto.Book;
import cogent.april6.activity1.impl.BookImpl;

/**
 * Hello world!
 *
 */
//@Configuration
//@ComponentScan("cogent.april6.activity1.impl")
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Program beginning");
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/april6/activity1/test/config.xml");
    	Scanner s = new Scanner(System.in);
    	BookDao dao = (BookDao)ctx.getBean("bookDao");
    	
    	
    	//Driver d;
    	int choice;
    	do {
    	       System.out.println("*****MENU*****");
    	        System.out.println("1. Create");
    	        System.out.println("2. Read");
    	        System.out.println("3. Read all");
    	        System.out.println("4. Update");
    	        System.out.println("5. Delete");
    	        System.out.println("6. Exit");
    	        System.out.println();
    		choice = s.nextInt();
    		
    		switch (choice) {
    		case 1:
    			System.out.println("\nCreating new book...");
    			Book book = new Book();

    	        int i = dao.create(book);
    	        if(i>0) {
    	        	System.out.println("Object saved");
    	        }
    			break;
    		case 2:
    			// Why do the read methods call the constructor??
    			System.out.println("\nReading a book...");
    			System.out.println("Enter a book id: ");
    			int id = s.nextInt();
    			System.out.println(dao.read(id));
    			break;
    		case 3:
    			System.out.println("\nReading all books...");
    			List <Book> books = dao.readAll();
    			for(Book bookl : books) {
    				System.out.println(books.indexOf(bookl) + " " + bookl);
    			}
    			break;
    		case 4:
    			System.out.println("\nUpdating book...");
    			Book nbook = new Book();

    	        int j = dao.update(nbook);
    	        System.out.println(j);
    	        if(j>0) {
    	        	System.out.println("Object updated");
    	        }
    			break;
    		case 5:
    			System.out.println("Eneter a book id to delete: ");
    			int did = s.nextInt();
    			
    			System.out.println("Deleting book...");
    			int n = dao.delete(did);
    			System.out.println(n);
    			System.out.println("Book deleted.");
    			break;
    		case 6:
    			System.out.println("Terminating...");
    			break;
    			default:
    				break;
    		}
    			
    		
    	}while(choice < 6);
 
    	System.out.println("Program terminated.");
    }
}
