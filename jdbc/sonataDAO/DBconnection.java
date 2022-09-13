package com.sonataDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

		// TODO Auto-generated method stub
		public Connection connection;
		public Connection getconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root@123");
			
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(SQLException e1) {e1.printStackTrace();}
		return connection;
		}
		public void close() {
			try {
				if(connection != null) {
					connection.close();}
			}catch(SQLException e2) {e2.printStackTrace();}
		}

	}
