package employeeapp;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import employeeapp.dao.EmployeeDao;
import employeeapp.model.Employee;

@Controller
public class MainClass {
	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/")
    public String home(Model m) {
		List<Employee> employees= employeeDao.getEmployees();
		m.addAttribute("employees", employees);
		return "index";
 }
	@RequestMapping("/add-employee")
	public String addEmployee(Model m) {
		m.addAttribute("title","Add Employee");	
		return "add_employee_form";
	}
	@RequestMapping(value="/handle-employee",method=RequestMethod.POST)
	public RedirectView handleEmployee(@ModelAttribute Employee employee,HttpServletRequest request)
	{
		System.out.println(employee);
		employeeDao.createEmployee(employee);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
}
