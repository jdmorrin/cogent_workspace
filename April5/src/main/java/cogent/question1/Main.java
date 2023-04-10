package cogent.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import cogent.April5.BeanConfiguration;
//import cogent.April5.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);;
		Person p = (Person)ctx.getBean("person");
		System.out.println("Person");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println();
		Product pr = (Product)ctx.getBean("product");
		System.out.println("Product");
		System.out.println(pr.getProductName());
		System.out.println(pr.getPrice());
	}

}
