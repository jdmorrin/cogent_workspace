package cogent.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/question2/config.xml");
		University u1 = (University)ctx.getBean("uni");
		System.out.println(u1);
		System.out.println(u1.hashCode());
		
		University u2 = (University)ctx.getBean("uni");
		System.out.println(u2);
		System.out.println(u2.hashCode());
		

	}

}
