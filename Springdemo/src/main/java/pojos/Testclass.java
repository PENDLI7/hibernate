package pojos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass {
	public static void main(String[] args) {
		ApplicationContext contect=new ClassPathXmlApplicationContext("Spring.xml");
		Network net=(Network) contect.getBean("jio");
		net.callRates();
		net.dataPlans();
		net.sms();
		System.out.println("...............other network...");
		Network airtel=(Network) contect.getBean("airtel");
		airtel.callRates();
		airtel.dataPlans();
		airtel.sms();
	}

}
