package cogent.fullApp.com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.fullApp.com.entities.Book;
import cogent.fullApp.com.repositories.BookRepo;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/books")
public class BookController {
	@Autowired
	private BookRepo repo;
	
	@GetMapping("/all")
	public List<Book> getAllBooks(){
		return (List<Book>)repo.findAll();
	}
}
