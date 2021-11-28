package com.sagarshinde.main;

import java.util.Scanner;

import com.sagarshinde.model.Employee;
import com.sagarshinde.service.CredentialService;

public class Driverclass {
	public static Employee Employee = new Employee("Sagar","Shinde");	
	public static CredentialService CredentialService= new CredentialService();
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Hello World!"); // S1
		displayMenu();
		int userChoice = scanner.nextInt();
		String emailAddress="";
		String password="";
		String department="";
		switch(userChoice) {
		case 1: 
			department ="tech";
			System.out.println("Selected Department : Technical"); 
		break;
		
		case 2:department ="Admin";
		System.out.println("Selected Department : Admin"); 
		break;
		
		case 3: department ="HR";
		System.out.println("Selected Department : HR"); 
		break;
		
		case 4: department ="Legal";
		System.out.println("Selected Department : Legal"); 
		break;
		
		default : System.out.println("Invalid Choice");		
		} 	
		emailAddress = CredentialService.generateEmailAddress(Employee.getfirstName(),Employee.getlastName(),department);
	 	password= CredentialService.generatePassword();
	 	CredentialService.showCredentials(emailAddress, password);
			
	}
	public static void displayMenu() {
		
		
		System.out.println("Please Enter department from the following");  
		System.out.println("1.Technical"); 
		System.out.println("2.Admin "); 
		System.out.println("3.Human resource"); 
		System.out.println("4.Legal"); 		
		System.out.println("Selected department - ");
		
	}
	
	
			
	}
