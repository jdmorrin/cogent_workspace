package cogent.lc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/lc/config.xml");
		Patient p = (Patient)ctx.getBean("patient");
		System.out.println(p.getId());

	}

}
