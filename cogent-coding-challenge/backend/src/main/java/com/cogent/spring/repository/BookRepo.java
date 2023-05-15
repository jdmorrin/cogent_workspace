package com.cogent.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogent.spring.entity.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer>{

}
