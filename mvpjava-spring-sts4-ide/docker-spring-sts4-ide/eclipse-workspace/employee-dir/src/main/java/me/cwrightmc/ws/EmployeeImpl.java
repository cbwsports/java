package me.cwrightmc.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeImpl implements EmployeeInterface{

	public static List<Employee> employees = new ArrayList<Employee>(); 
	
	static {
		Employee employee1 = new Employee ("Chris", "Wright", "DevOps Engineer" , "cbwsports@gmail.com", 29, 100000);
		Employee employee2 = new Employee ("Court", "Wright", "Program Analyst" , "cstewa13@gmail.com", 28, 99000);
		Employee employee3 = new Employee ("Ysmael", "Baylor", "Java Developer" , "ybaylor@captechconsulting.com", 33, 125000);
		Employee employee4 = new Employee ("Bobby", "Adams", "Frontend Developer" , "badams@captechconsulting.com", 27, 88000);
		Employee employee5 = new Employee ("MyCah", "Pleasant", "Frontend Developer" , "mpleasant@captechconsulting.com", 29, 142000);

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
	}

	public void createEmployee(String fName, String lName, String title, String email, int age, int salary){
		employees.add(new Employee(fName, lName, title, email, age, salary));
	}
	
	public Employee getEmployee(int id) {
		return employees.get(id);
	}

//	public void updateEmployee(Employee employee){
//		//sql command to update
//	}
//
	public Employee removeEmployee(int id){
		return employees.remove(id);
	}

	public List<Employee> listEmployee(){
		return employees;
	}

	public List<Employee> FirstNameSearch(String fName){
		List<Employee> employeeList = new ArrayList<Employee>();
		for(Employee employee : employees) {
			if(employee.getFname().equals(fName)) {
				employeeList.add(employee);
			}
		}
		return employeeList;
	}

	public List<Employee> LastNameSearch(String lName){
		List<Employee> employeeList = new ArrayList<Employee>();
		for(Employee employee : employees) {
			if(employee.getLname().equals(lName)) {
				employeeList.add(employee);
			}
		}
		return employeeList;
	}

	public List<Employee> TitleSearch(String title){
		List<Employee> employeeList = new ArrayList<Employee>();
		for(Employee employee : employees) {
			if(employee.getTitle().equals(title)) {
				employeeList.add(employee);
			}
		}
		return employeeList;
	}
}
