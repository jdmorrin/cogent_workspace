package com.cogent.spring.service;

import java.util.List;
import java.util.Optional;

import com.cogent.spring.entity.Book;

public interface BookService {
	public Optional<Book> get(Integer bookId);
	public Book add(Book b);
	public Book edit(Book b);
	public List<Book> listAll();
	public void delete(Book b);
}
