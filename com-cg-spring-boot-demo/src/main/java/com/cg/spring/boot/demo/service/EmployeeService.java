package com.cg.spring.boot.demo.service;

import java.util.List;

import com.cg.spring.boot.demo.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int id);
	public void saveOrUpdate(Employee employee);
	public void delete(int id);
	public void update(Employee employee, int eid);
	public List<Employee> getEmployeeByName(String name);
}
