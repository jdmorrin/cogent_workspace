package com.cogent.infotech.april11.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogent.infotech.april11.entities.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{
	User findByUsername(String name);
}
