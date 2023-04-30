package com.example.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.modal.Employee;
import com.example.service.EmpServiceImpl;

@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmpServiceImpl employeeServiceImpl;
	
	@PostMapping("/add")
	public String add(@RequestBody Employee employee) {
		employeeServiceImpl.addEmployee(employee);
		return "Added successfully";		
	}

	@GetMapping("/findall")
	public ArrayList<Employee> getAllEmployee() {
		return employeeServiceImpl.findAllEmployee();
	}

	@PutMapping("/update")
	public String update(@RequestBody Employee employee) {
		employeeServiceImpl.updateEmployee(employee);
		return "Updated Successfully";
	}
	
	@GetMapping("/findbyid/{id}")
	public Employee getEmployeeUsingId(@PathVariable long id) {
		return employeeServiceImpl.findAllEmployeeByID(id);		
	}
	
	@DeleteMapping("/delete") 
	public String delete() {
		employeeServiceImpl.deleteAllData();
		return "Deleted Successfully";
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable long id) {
		Employee employee = employeeServiceImpl.findAllEmployeeByID(id);
		employeeServiceImpl.deleteEmployee(employee);
		return employee.toString() + " Deleted SuccessFully";		
	}	
}
