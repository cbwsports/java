package me.cwrightmc.ws;

import java.util.List;

public interface EmployeeInterface {
	
	public void createEmployee(String fName, String lName, String title, String email, int age, int salary);

//	public void updateEmployee(Employee employee);

	public Employee getEmployee(int id);
	
	public Employee removeEmployee(int id);

	public List<Employee> listEmployee();

	public List<Employee> FirstNameSearch(String fName);

	public List<Employee> LastNameSearch(String lNme);
	
	public List<Employee> TitleSearch(String title);
	
}
