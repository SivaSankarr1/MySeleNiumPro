package org.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCconnectionTest {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try {
		//load driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
	//Connect DataBase
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:xe","hr","Success$2023");
		//write a SQL query
	String sql="select * from employees";
	//Prepare statement
	PreparedStatement prepareStatement = connection.prepareStatement(sql);
		//Execute Query
	ResultSet executeQuery = prepareStatement.executeQuery();
	while(executeQuery.next()) {
		String firstname = executeQuery.getString("First_name");
		System.out.print(firstname+"\t\t");
		String lastname = executeQuery.getString("Last_name");
		System.out.print(lastname);
		System.out.println();
		
	}
	//close connection
	connection.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}