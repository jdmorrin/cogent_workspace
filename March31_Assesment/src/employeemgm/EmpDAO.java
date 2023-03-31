package employeemgm;

import java.util.List;

public interface EmpDAO {
	public void create(List <Employee> l);
	public Employee search(List <Employee> l);
	public void update(List <Employee> l);
	public void delete(List <Employee> l);
	public void printAll(List <Employee> l);
}
