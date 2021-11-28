package com.sagarshinde.model;

public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastname(String lastName) {
		this.lastName = lastName;
}
	
}
