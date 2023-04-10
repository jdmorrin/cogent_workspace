package cogent.autowire.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/autowire/qualifier/config.xml");
		Employee p = (Employee)ctx.getBean("employee");
		Address c = p.getAdr();
		System.out.println(p);

	}

}
