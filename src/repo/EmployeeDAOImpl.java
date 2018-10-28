package repo;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public List<Employee> getAll() {
        Session session = sessionFactory.openSession();

        Criteria query = session.createCriteria(Employee.class);
        List<Employee> empList = query.list();
        return empList;
    }
    public void update(int empId, String department) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Employee emp = (Employee) session.get(Employee.class, empId);
        emp.setDepartment(department);
        session.update(emp);
        tx.commit();
        session.close();
    }
}