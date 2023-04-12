package com.cogent.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.spring.entity.Book;
import com.cogent.spring.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService service;
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return service.add(book);
		
	}
	
	@GetMapping("/books")
	public List<Book> listBooks(){
		return service.listAll();
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return service.add(book);
	}
	
	@DeleteMapping("/books")
	public String deleteBook(@RequestParam(value="id") Integer id) {
		Optional<Book> i = service.get(id);
		service.delete(i.get());
		return "Book id " +id+" was deleted";
	}
}
