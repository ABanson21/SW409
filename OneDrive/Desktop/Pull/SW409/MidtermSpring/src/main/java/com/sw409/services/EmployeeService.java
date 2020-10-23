package com.sw409.services;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sw409.models.Employee;
import com.sw409.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public ArrayList<Employee>getAllEmployees(){
		return (ArrayList<Employee>) employeeRepository.findAll();
	}
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);		
	}
	
	public void updateEmployee(Integer id, Employee employee) {
		Employee oldEmployee = employeeRepository.findById(id).get();
		oldEmployee.setName(employee.getName());
		oldEmployee.setTitle(employee.getTitle());
		employeeRepository.save(employee);
			}
	
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);			
		}
	}
	