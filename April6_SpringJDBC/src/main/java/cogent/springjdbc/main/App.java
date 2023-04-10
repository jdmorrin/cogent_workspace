package cogent.springjdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cogent.springjdbc.employee.dao.EmployeeDao;
import cogent.springjdbc.employee.dto.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/springjdbc/main/config.xml");
        EmployeeDao dao = (EmployeeDao)ctx.getBean("employeeDao");
        Employee emp = new Employee();
        emp.setId(1001);
        emp.setFirst("Juan");
        emp.setLast("Morrell");
        int i = dao.create(emp);
        if(i<0) {
        	System.out.println("Object saved");
        }
    }
}
