package controller;

import pojo.Employee;
import service.Employeeservice;


public class Employeecontroller {
	private Employeeservice employeeservice;

	
	public void setEmployeeservice(Employeeservice employeeservice) {
		this.employeeservice = employeeservice;
	}


	public void save(Employee employee) {
		System.out.println("employee controller save method");
		employeeservice.save(employee);
		
	}

}
