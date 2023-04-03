package jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		String conURL = "jdbc:mysql://localhost:3306/cogentdb";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the dept_num of the salaries that need updating: ");
		int dept_num = s.nextInt();
		
		System.out.println("What is the new salary of this department? ");
		int emp_salary = s.nextInt();
		
		String qry = "update employees "
				+ "set emp_salary=" + emp_salary
				+ " where dept_num="+dept_num;
		
		try(
			Connection con = DriverManager.getConnection(conURL, "root", "password");
			Statement stmt = con.createStatement();
		){
			int row = stmt.executeUpdate(qry);
			System.out.println("Rows updated in database: ");
			//ResultSet rs = stmt.executeUpdate(qry);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
