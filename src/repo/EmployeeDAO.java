package repo;

import java.util.List;

import domain.Employee;

public interface EmployeeDAO {
    // Method to get all Employees from Employee table
     public List<Employee> getAll();
    // Method to update a record 
    public void update(int empId, String department);
}