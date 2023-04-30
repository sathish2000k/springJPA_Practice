package com.example.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
