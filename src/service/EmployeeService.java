package service;

import java.util.List;

import domain.Employee;
public interface EmployeeService {
	// Method to access data access layer method to insert Employee record
	public List<Employee> getEmployees();
	// Method to access data access layer method to update a record
	public void updateEmployee(int empId,String department);
}