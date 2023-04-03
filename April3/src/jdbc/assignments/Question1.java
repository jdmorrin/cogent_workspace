package jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String qry = "insert into dept values(40,'Delivery', 'Colombo', 11000);";
		String conURL = "jdbc:mysql://localhost:3306/cogentdb";
		
		try(
			Connection con = DriverManager.getConnection(conURL, "root", "password");
			Statement stmt = con.createStatement();
		){
			int row = stmt.executeUpdate(qry);
			System.out.println("Rows inserted into database: ");
			//ResultSet rs = stmt.executeUpdate(qry);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
