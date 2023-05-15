package com.cogent.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.spring.entity.Book;
import com.cogent.spring.repository.BookRepo;
import com.cogent.spring.service.BookService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	BookService service;
	@Autowired
	private BookRepo repo;
	
	@PostMapping("/add")
	public Book addBook(@RequestBody Book book) {
		return service.add(book);
		
	}
	
	@GetMapping("/get")
	public Book get(@RequestParam(name = "id") Integer id) {
		return service.get(id).get();
	}
	
	@GetMapping("/all")
	public List<Book> listBooks(){
		return service.listAll();
	}
	
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book, @RequestParam(name = "id") Integer id) {
		Book toUpdate = service.get(id).get();
		
		if(book.getTitle() != null)
			toUpdate.setTitle(book.getTitle());
		if(book.getPrice() != null)
			toUpdate.setPrice(book.getPrice());
		
		return service.add(toUpdate);
	}
	
	@DeleteMapping("/delete")
	public void deleteBook(@RequestParam(value="id") Integer id) {
		Optional<Book> i = service.get(id);
		service.delete(i.get());
		//return "Book id " +id+" was deleted";
	}
}
