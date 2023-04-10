package cogent.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/autowire/annotation/config.xml");
		Person p = (Person)ctx.getBean("person");
		Car c = p.getCar();
		System.out.println(c);

	}

}
