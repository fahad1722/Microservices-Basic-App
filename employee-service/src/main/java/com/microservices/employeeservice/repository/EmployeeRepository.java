package com.microservices.employeeservice.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.microservices.employeeservice.model.Employee;

@Repository
public class EmployeeRepository {

	private List<Employee> employees = new ArrayList<>();

	public Employee add(Employee employee) {
		employees.add(employee);
		return employee;
	}

	public Optional<Employee> findById(Long id) {
		return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst();
	}

	public List<Employee> findAll() {
		return employees;
	}

	public List<Employee> findByDepartment(Long departmentId) {
		return employees.stream().filter(employee -> employee.getDepartmentId().equals(departmentId)).toList();
	}
}
