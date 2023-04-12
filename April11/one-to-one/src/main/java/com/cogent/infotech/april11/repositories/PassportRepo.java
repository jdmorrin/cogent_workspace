package com.cogent.infotech.april11.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogent.infotech.april11.enitites.Passport;

@Repository
public interface PassportRepo extends CrudRepository<Passport, Long>{

}
