package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.Employeecontroller;
import pojo.Employee;

public class Employeeclient {

	public static void main(String[] args) {
   Employee employee=new Employee(2,"jthu", 22000.00);
   ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
   Employeecontroller employeecontroller=(Employeecontroller) context.getBean("empController");
   employeecontroller.save(employee);
	}
}
