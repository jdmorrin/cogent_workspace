package cogent.question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/question3/config.xml");
		Customer c = (Customer)ctx.getBean("customer");
		System.out.println("Customer: " + c.getName());
		Reservation r = c.getRsrv();
		System.out.println("Reservation: " + r);
		

	}

}
