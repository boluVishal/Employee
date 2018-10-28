package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Employee;
import repo.EmployeeDAO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDAO employeeDao;
	public List<Employee> getEmployees() {
		return employeeDao.getAll();
	}
	public void updateEmployee(int empId, String department) {
		employeeDao.update(empId, department);
	}
}
 
