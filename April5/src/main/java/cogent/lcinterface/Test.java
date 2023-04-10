package cogent.lcinterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/lcinterface/config.xml");
		Patient p = (Patient)ctx.getBean("patient");
		System.out.println(p);
		ctx.registerShutdownHook();

	}

}
