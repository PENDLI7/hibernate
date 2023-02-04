package cilent;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entity.Employee;



public class Employeeclient {
	public static void main(String[] args) {
		Employee employee = new Employee("createiq", "tech", 22000);
//		Employee employee3 = new Employee("jithu", "reddy", 22000);
//		Employee employee1 = new Employee("createiq", "tech", 22000);
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(employee);
//		Query query = session.createQuery("from Employee");
//		List<Employee> employees = query.list();
//		for (Employee employee4 : employees) {
//			System.out.println(employee4);
//		}
		tx.commit();
		session.close();

	}

}
