package cogent.springjdbc.employee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import cogent.springjdbc.employee.dao.EmployeeDao;
import cogent.springjdbc.employee.dto.Employee;
@Component("employeeDao")
public class EmployeeImpl implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate template;	// Need dependencies
	
	
	@Override
	public int create(Employee employee) {
		String sql ="insert into employees values(???)";
		int result=template.update(sql,employee.getId(),employee.getFirst(),employee.getLast());
		return result;
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
