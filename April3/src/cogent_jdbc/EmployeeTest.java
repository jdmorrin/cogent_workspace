package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String qry = "select * from employee;";
		String qry = "insert into employee(emp_no,emp_name,emp_salary) values("
				+ "1004,'Shiva',30000)";
		String conUrl="jdbc:mysql://localhost:3306/test";

		// Fetching data
		// try with resource
		// resources in parentheses
		// We open the resources and then they are automatically closed
		try (
			Connection con = DriverManager.getConnection(conUrl,"root","password");
			Statement stmt = con.createStatement();
			
			
		){
			ResultSet rs = stmt.executeQuery("select * from employee");
			ResultSetMetaData rsMeta = rs.getMetaData();
			int totalCols = rsMeta.getColumnCount();
			System.out.println("The total number of columns is: " + totalCols);
			for(int i = 1; i<totalCols;i++) {
				String colName = rsMeta.getCatalogName(i);
				System.out.println("Column number: " + i);
				System.out.println("Column name: " + colName);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
