package com.crud.crud_springboot.repository;

import com.crud.crud_springboot.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<EmployeeModel,Integer> {
}
