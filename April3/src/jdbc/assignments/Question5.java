package jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question5 {

	public static void main(String[] args) {
		String conURL = "jdbc:mysql://localhost:3306/cogentdb";
		
		String qry = "select employees.*, dept.dept_name from employees join dept on employees.dept_num=dept.dept_num;";
		
		try(
			Connection con = DriverManager.getConnection(conURL, "root", "password");
			Statement stmt = con.createStatement();
		){

			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next()) {
				System.out.println("EmpID: " + rs.getInt("emp_num") 
				+ " EmpName: " + rs.getString("emp_name")
				+ " Salary: " + rs.getInt("emp_salary")
				+ " Department Number: "+rs.getInt("dept_num")
				+ " Department name: "+rs.getString("dept.dept_name"));
			}
			
			//ResultSet rs = stmt.executeUpdate(qry);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
