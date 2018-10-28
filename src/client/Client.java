package client;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Employee;
import service.EmployeeService;
public class Client {
    public static void main(String arg[]) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");
        System.out.println("Update Employee with new department details: ");
        System.out.println("Enter the empId to be updated ");
        Scanner scanner = new Scanner(System.in);
        int empId = scanner.nextInt();
        System.out.println("Enter new department ");
        String department = scanner.next();
        employeeService.updateEmployee(empId, department);
        System.out.println("Record updated successfully..");
        System.out.println("View All Employees");
        ArrayList<Employee> alist = (ArrayList<Employee>) employeeService.getEmployees();
        for (Employee elist : alist) {
            System.out.println(elist);
        }
        scanner.close();
        ctx.close();
    }

}