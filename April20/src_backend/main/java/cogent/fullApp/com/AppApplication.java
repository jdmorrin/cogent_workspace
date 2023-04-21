package cogent.fullApp.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.fullApp.com.entities.Book;
import cogent.fullApp.com.repositories.BookRepo;

@SpringBootApplication
public class AppApplication implements CommandLineRunner{

	@Autowired
	BookRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		books.add(new Book("Ensaio sobre a Cegueira", 22.35));
		books.add(new Book("La Dama de las Camelias", 33.50));
		books.add(new Book("Leviathan", 30.99));
		repo.saveAll(books);
	}

}
