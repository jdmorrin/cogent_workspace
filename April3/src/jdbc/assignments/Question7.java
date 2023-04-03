package jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String conURL = "jdbc:mysql://localhost:3306/cogentdb";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an employee number: ");
		int emp_num = s.nextInt();
		
		String qry = "select employees.emp_name, dept.dept_manager "
				+ "from employees "
				+ "join dept on employees.dept_num=dept.dept_num "
				+ "where employees.emp_num="+emp_num+";";
		
		try(
			Connection con = DriverManager.getConnection(conURL, "root", "password");
			Statement stmt = con.createStatement();
		){

			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next()) {
				System.out.println("|EmpName: " + rs.getString("employees.emp_name")
				+ " |Manager: " + rs.getString("dept.dept_manager"));
			}
			
			//ResultSet rs = stmt.executeUpdate(qry);
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}
