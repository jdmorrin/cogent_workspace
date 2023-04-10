package cogent.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/innerbean/config.xml");
		Employee e = (Employee)ctx.getBean("employee");
		System.out.println(e.hashCode());
		System.out.println(e.getAddr());

		Employee e2 = (Employee)ctx.getBean("employee");
		System.out.println(e2.hashCode());
		System.out.println(e2.getAddr());
	}

}
