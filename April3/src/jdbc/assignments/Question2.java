package jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String conURL = "jdbc:mysql://localhost:3306/cogentdb";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the emp_num that you wish to update: ");
		int emp_num = s.nextInt();
		
		System.out.println("What is the new salary of this employee? ");
		int emp_salary = s.nextInt();
		
		String qry = "update employees "
				+ "set emp_salary=" + emp_salary
				+ " where emp_num="+emp_num;
		
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
