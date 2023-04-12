package com.cogent.infotech.april11.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogent.infotech.april11.enitites.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long>{

}
