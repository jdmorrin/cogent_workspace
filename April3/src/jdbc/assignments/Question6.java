package jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question6 {

	public static void main(String[] args) {
		String conURL = "jdbc:mysql://localhost:3306/cogentdb";
		
		String qry = "select emp_salary,emp_num,emp_name,dept_num from employees "
				+ "where dept_num=30 and emp_salary=("
				+ "select max(emp_salary) from employees where dept_num=30"
				+ ");";
		
		try(
			Connection con = DriverManager.getConnection(conURL, "root", "password");
			Statement stmt = con.createStatement();
		){

			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next()) {
				System.out.println("EmpID: " + rs.getInt("emp_num") 
				+ " |EmpName: " + rs.getString("emp_name")
				+ " |Salary: " + rs.getInt("emp_salary")
				+ " |Department Number: "+rs.getInt("dept_num"));
			}
			
			//ResultSet rs = stmt.executeUpdate(qry);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
