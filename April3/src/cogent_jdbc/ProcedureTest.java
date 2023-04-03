package cogent_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ProcedureTest {

	public static void main(String[] args) {
				String qry = "call retreive_persons";
				String conUrl="jdbc:mysql://localhost:3306/cogentdb";

				try (
					Connection con = DriverManager.getConnection(conUrl,"root","password");
						
				){
					CallableStatement stmt = con.prepareCall(qry);
					ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt("id"));
						System.out.println(rs.getString("first_name"));
						System.out.println(rs.getString("last_name"));
					}
				}catch(Exception e) {
					e.printStackTrace();
				}

	}

}
