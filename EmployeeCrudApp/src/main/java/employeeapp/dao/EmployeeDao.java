package employeeapp.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import employeeapp.model.Employee;


@Component
public class EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create
	@Transactional
	public void createEmployee(Employee employee) {

		this.hibernateTemplate.save(employee);

	}

	// get all employees
	public List<Employee> getEmployees() {
		List<Employee> employees = this.hibernateTemplate.loadAll(Employee.class);
		return employees;
	}

	// delete the single employee
	@Transactional
	public void deleteEmployee(int eid) {
		Employee e = this.hibernateTemplate.load(Employee.class, eid);
		this.hibernateTemplate.delete(e);
	}

	// get the single employee
	public Employee getEmployee(int eid) {
		return this.hibernateTemplate.get(Employee.class, eid);
	}
}