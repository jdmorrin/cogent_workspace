package cogent.April4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Person p = (Person)ctx.getBean("person");
        System.out.println(p.getName());
        System.out.println(p.getId());
        System.out.println(p.getAge());
        Greeting g = (Greeting)ctx.getBean("hello");
        Employee e = (Employee)ctx.getBean("emp");
        System.out.println(g.message());
        System.out.println("Employee no: " + e.getId() + " |Employee name: " + e.getName());
    
        System.out.println("\nHospital");
        Hospital h = (Hospital)ctx.getBean("hospital");
        System.out.println("Name: " + h.getName());
        System.out.println("Department: " + h.getDepartment());
        System.out.println("Type: " + h.getClass());
        
        System.out.println("\nCustomer map");
        Customer c = (Customer)ctx.getBean("customer");
        System.out.println("CustomerID: " + c.getId());
        System.out.println("Map: " + c.getProducts());
        System.out.println("Class: " + c.getClass());
        System.out.println(c);
        
        System.out.println("\nCar Dealer Set");
        CarDealer cd = (CarDealer)ctx.getBean("cardealer");
        System.out.println(cd.getName());
        System.out.println(cd.getModels().getClass().getName());
        System.out.println(cd.getModels());
        
        System.out.println("\nStudent and Scores Referemce Injection");
        Student st = (Student)ctx.getBean("student");
        System.out.println(st.getScores());
    }
}
