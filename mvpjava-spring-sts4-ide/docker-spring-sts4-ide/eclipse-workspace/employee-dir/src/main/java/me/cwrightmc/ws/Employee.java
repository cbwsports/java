package me.cwrightmc.ws;

public class Employee{
	String firstName;
	String lastName;
	String title ;
	String email;
	int id;
	static int counter = 0;
	int age;
	int salary;

	Employee(String fName, String lName, String title, String email, int age, int salary){
		this.firstName = fName;
		this.lastName = lName;
		this.title = title;
		this.email = email;
		this.id = counter++;
		this.age = age;
		this.salary = salary;
	}
	
	Employee(){
		
	}

	public void setFname(String fName){
		this.firstName = fName;
	}

	public String getFname(){
		return firstName;
	}

	public void setLname(String lName){
		this.lastName = lName ;
	}

	public String getLname(){
		return lastName;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}
}