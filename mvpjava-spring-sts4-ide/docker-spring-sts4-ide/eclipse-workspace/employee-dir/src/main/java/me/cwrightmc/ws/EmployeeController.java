package me.cwrightmc.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
public class EmployeeController {
	public static final String template = "%s, has been terminated!";
	@Autowired
	EmployeeInterface empInterface;
	
	@PostMapping("/create")
	public void createEmp(@RequestParam String fName, @RequestParam String lName, @RequestParam String title, @RequestParam String email, @RequestParam int age, @RequestParam int salary) {
		empInterface.createEmployee( fName, lName, title , email, age, salary);
	}
	
	@GetMapping("/list")
	public List<Employee> listEmp() {
		return empInterface.listEmployee();
	}
	
	@GetMapping("/describe/{id}")
	public Employee describeEmp(@PathVariable("id") int id) {
		return empInterface.getEmployee(id);
	}
	
	@GetMapping("/first")
	public List<Employee> searchFirst(@RequestParam String fName) {
		return empInterface.FirstNameSearch(fName);
	}
	
	@GetMapping("/last")
	public List<Employee> searchLast(@RequestParam String lName) {
		return empInterface.LastNameSearch(lName);
	}
	
	@GetMapping("/title")
	public List<Employee> searchTitle(@RequestParam String title) {
		return empInterface.TitleSearch(title);
	}
	
	@DeleteMapping("/remove/{id}")
	public String removeEmp(@PathVariable("id") int id) {
		Employee terminatedEmp = new Employee();
		terminatedEmp = empInterface.removeEmployee(id);
		return String.format(template, terminatedEmp.getFname());
	}
}
