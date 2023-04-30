package com.example.service;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.modal.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public ArrayList<Employee> findAllEmployee() {
		return (ArrayList<Employee>) employeeRepository.findAll();
	}


	@Override
	public Employee findAllEmployeeByID(long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent())
			return employee.get();
		else
			return null;
				
	}


	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);	
	}


	@Override
	public void deleteAllData() {
		employeeRepository.deleteAll();
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);				
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);		
	}	
	
}
