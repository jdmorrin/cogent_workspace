package jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question10 {

	public static void main(String[] args) {
		String conURL = "jdbc:mysql://localhost:3306/cogentdb";
		
		String qry = "select * from employees where job_title='Analyst';";
		
		try(
			Connection con = DriverManager.getConnection(conURL, "root", "password");
			Statement stmt = con.createStatement();
		){

			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next()) {
				System.out.println("|EmpNum: " + rs.getInt("emp_num")
						+ " |EmpName: " + rs.getString("emp_name")
						+ " |Salary: " + rs.getString("emp_salary")
						+ " |Job Title: " + rs.getString("job_title")
						+ " |Department Number: " + rs.getString("dept_num"));
			}
			
			//ResultSet rs = stmt.executeUpdate(qry);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
