package com.sw409.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.models.Employee;
import com.sw409.services.EmployeeService;

@RestController
@CrossOrigin("*")
@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
public class EmployeeController {
	//https://d2qapc7p0tvi6g.cloudfront.net/
	@Autowired
	public EmployeeService employeeService;
	
	@GetMapping("api/v1/getEmployees")
	public ArrayList<Employee>getAllEmployees(){
	return employeeService.getAllEmployees();
	}
	
	@PostMapping("/api/v1/createEmployee")
	public Employee create(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@PutMapping("/api/v1/updateEmployee/{id}")
	public void update(@PathVariable("id") Integer id, @RequestBody Employee employee) {
		employeeService.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/api/v1/deleteEmployee/{id}")
	public void delete(@PathVariable("id") Integer id, @RequestBody Employee employee){
		employeeService.deleteEmployee(id);
	}	
	
	

}
