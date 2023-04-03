package jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		String conURL = "jdbc:mysql://localhost:3306/cogentdb";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the emp_num that you wish to update: ");
		int emp_num = s.nextInt();
		
		String qry = "delete from employees where emp_num=" + emp_num;
		
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
