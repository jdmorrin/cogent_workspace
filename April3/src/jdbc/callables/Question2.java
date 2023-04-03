package jdbc.callables;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		String conUrl="jdbc:mysql://localhost:3306/cogentdb";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an employee id: ");
		int num = s.nextInt();
		String qry = "call proc_dname(" + num +");";
		
		try (
			Connection con = DriverManager.getConnection(conUrl,"root","password");
			){
			
			CallableStatement stmt = con.prepareCall(qry);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("dept_num"));
				System.out.println(rs.getString("dept_name"));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
