package cogent.April5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cogent.April5.BeanConfiguration;
import cogent.April5.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);;
		Person p = (Person)ctx.getBean("person");
		System.out.println(p.getName());
    }
}
