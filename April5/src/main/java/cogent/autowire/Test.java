package cogent.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/autowire/config.xml");
		Person p = (Person)ctx.getBean("person");
		Car c = p.getCar();
		Address a = p.getAddr();
		System.out.println(c + "\n" + a);
	}

}
