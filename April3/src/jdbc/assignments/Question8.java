package jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		String conURL = "jdbc:mysql://localhost:3306/cogentdb";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a department number: ");
		int dept_num = s.nextInt();
		
		String qry = "select employees.emp_num, employees.emp_name, employees.emp_salary, dept.dept_num, dept.avg_sal from employees "
				+ "join dept on employees.dept_num=dept.dept_num "
				+ "where dept.dept_num="+dept_num +" and employees.emp_salary>dept.avg_sal;";
		
		try(
			Connection con = DriverManager.getConnection(conURL, "root", "password");
			Statement stmt = con.createStatement();
		){

			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next()) {
				System.out.println("|EmpNum: " + rs.getInt("employees.emp_num")
						+ "|EmpName: " + rs.getString("employees.emp_name"));
			}
			
			//ResultSet rs = stmt.executeUpdate(qry);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
