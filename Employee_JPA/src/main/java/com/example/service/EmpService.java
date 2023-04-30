package com.example.service;

import java.util.ArrayList;

import com.example.modal.Employee;


public interface EmpService {
	ArrayList<Employee> findAllEmployee();
	Employee findAllEmployeeByID(long id);
	void addEmployee(Employee employee);
	void deleteAllData();
	void updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
}
