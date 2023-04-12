package com.cogent.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogent.spring.entity.Item;

@Repository
public interface ItemReposetory extends CrudRepository<Item, Integer>{

}
