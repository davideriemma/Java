package javaStudies;

import java.sql.*;

public class JDBCCreateTable
{

	public static void main(String[] args)
	{
		String dbname = "./test";
		String username = "davide";
		String password = "test123";
		String sqlQuery = "CREATE TABLE TestTable("
				+ "name VARCHAR,"
				+ "surname VARCHAR"
				+ ");";
		
		try
		{
			//open a database connection
			Connection conn = DriverManager.getConnection("jdbc:h2:" + dbname + username + password);
			//create a prepared statement
			Statement stmt = conn.createStatement();
			//execute table creation
			stmt.executeUpdate(sqlQuery);
			
		} catch (SQLException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
