package service;

import dao.EmployeeDao;
import dao.EmployeeDaoimpl;
import pojo.Employee;

public class Employeeserviceimpl implements Employeeservice {
	
	
 EmployeeDao employeedao;

	


	public void setEmployeedao(EmployeeDao employeedao) {
	this.employeedao = employeedao;
}




	public void save(Employee employee) {
		System.out.println("employee service implementation method");
		employeedao.save(employee);
	}

}
