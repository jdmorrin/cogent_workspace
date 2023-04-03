package jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		String conURL = "jdbc:mysql://localhost:3306/cogentdb";
		
		String qry = "select emp_num, emp_name from employees "
				+ "where emp_salary=("
				+ "select emp_salary from employees where emp_name='ford'"
				+ ");";
		
		try(
			Connection con = DriverManager.getConnection(conURL, "root", "password");
			Statement stmt = con.createStatement();
		){

			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next()) {
				System.out.println("|EmpNum: " + rs.getInt("emp_num")
						+ "|EmpName: " + rs.getString("emp_name"));
			}
			
			//ResultSet rs = stmt.executeUpdate(qry);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
