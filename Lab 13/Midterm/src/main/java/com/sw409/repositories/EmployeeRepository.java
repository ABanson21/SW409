package com.sw409.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
