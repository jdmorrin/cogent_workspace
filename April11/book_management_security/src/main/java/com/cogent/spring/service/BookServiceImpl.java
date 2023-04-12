package com.cogent.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.spring.entity.Book;
import com.cogent.spring.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepo repo;
	
	@Override
	public Optional<Book> get(Integer bookId){
		return repo.findById(bookId);
	}
	
	@Override
	public Book add(Book b) {
		// TODO Auto-generated method stub
		return repo.save(b);
	}

	@Override
	public Book edit(Book b) {
		// TODO Auto-generated method stub
		return repo.save(b);
	}

	@Override
	public List<Book> listAll() {
		// TODO Auto-generated method stub
		return (List<Book>)repo.findAll();
	}

	@Override
	public void delete(Book b) {
		// TODO Auto-generated method stub
		repo.delete(b);
	}

}
